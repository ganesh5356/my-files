import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.*;

public class FileTransferServer {
    private static final int DEFAULT_PORT = 1238;
    private static final int BUFFER_SIZE = 8192;
    private static final int THREAD_POOL_SIZE = 8; // adjust as needed

    public static void main(String[] args) {
        int port = (args.length >= 1) ? Integer.parseInt(args[0]) : DEFAULT_PORT;

        ExecutorService pool = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server listening on port " + port);
            while (true) {
                Socket client = serverSocket.accept();
                pool.submit(() -> handleClient(client));
            }
        } catch (IOException e) {
            System.err.println("Server failed: " + e.getMessage());
        } finally {
            pool.shutdown();
        }
    }

    private static void handleClient(Socket clientSocket) {
        String clientAddr = clientSocket.getInetAddress().getHostAddress();
        System.out.println("Connected: " + clientAddr);
        try (Socket s = clientSocket;
             DataOutputStream dout = new DataOutputStream(new BufferedOutputStream(s.getOutputStream()));
             BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream(), StandardCharsets.UTF_8))) {

            // Read requested filename (single line)
            String fileName = in.readLine();
            if (fileName == null || fileName.trim().isEmpty()) {
                sendError(dout, "No filename provided");
                return;
            }
            fileName = fileName.trim();
            File file = new File(fileName);

            if (!file.exists() || !file.isFile()) {
                sendError(dout, "File not found: " + fileName);
                return;
            }

            long fileSize = file.length();
            dout.writeBoolean(true);        // OK
            dout.writeLong(fileSize);       // file length
            dout.flush();

            // Send file bytes
            try (FileInputStream fis = new FileInputStream(file)) {
                byte[] buffer = new byte[BUFFER_SIZE];
                int read;
                long sent = 0;
                while ((read = fis.read(buffer)) != -1) {
                    dout.write(buffer, 0, read);
                    sent += read;
                }
                dout.flush();
                System.out.println("Sent " + sent + " bytes for " + fileName + " to " + clientAddr);
            } catch (IOException e) {
                System.err.println("Error reading file: " + e.getMessage());
            }

        } catch (IOException e) {
            System.err.println("Connection error with " + clientAddr + ": " + e.getMessage());
        } finally {
            System.out.println("Connection closed: " + clientAddr);
        }
    }

    private static void sendError(DataOutputStream dout, String msg) {
        try {
            dout.writeBoolean(false); // not OK
            byte[] msgBytes = msg.getBytes(StandardCharsets.UTF_8);
            dout.writeInt(msgBytes.length); // length of error message
            dout.write(msgBytes);
            dout.flush();
            System.out.println("Sent error to client: " + msg);
        } catch (IOException e) {
            System.err.println("Failed to send error: " + e.getMessage());
        }
    }
}
