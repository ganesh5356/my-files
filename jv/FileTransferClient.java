import java.io.*;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class FileTransferClient {
    private static final int DEFAULT_PORT = 1238;
    private static final int BUFFER_SIZE = 8192;

    public static void main(String[] args) {
        if (args.length < 2 || args.length > 3) {
            System.out.println("Usage: java FileTransferClient <server> <filename> [port]");
            return;
        }

        String server = args[0];
        String fileName = args[1];
        int port = (args.length == 3) ? Integer.parseInt(args[2]) : DEFAULT_PORT;

        try (Socket socket = new Socket(server, port);
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
                DataInputStream din = new DataInputStream(new BufferedInputStream(socket.getInputStream()))) {

            // Send filename line
            writer.write(fileName);
            writer.write("\n");
            writer.flush();

            // Read response: boolean ok, then either (long size + bytes) or (int len +
            // error bytes)
            boolean ok = din.readBoolean();
            if (!ok) {
                int errLen = din.readInt();
                byte[] errBytes = new byte[errLen];
                din.readFully(errBytes);
                String errMsg = new String(errBytes, StandardCharsets.UTF_8);
                System.err.println("Server error: " + errMsg);
                return;
            }

            long fileSize = din.readLong();
            System.out.println("Receiving file (" + fileSize + " bytes): " + fileName);

            // Write received bytes to stdout (or you can save to disk)
            // Here we'll save to local file with prefix "received_"
            File outFile = new File("received_" + new File(fileName).getName());
            try (FileOutputStream fos = new FileOutputStream(outFile)) {
                byte[] buffer = new byte[BUFFER_SIZE];
                long remaining = fileSize;
                while (remaining > 0) {
                    int toRead = (int) Math.min(buffer.length, remaining);
                    int read = din.read(buffer, 0, toRead);
                    if (read == -1)
                        throw new EOFException("Unexpected end of stream");
                    fos.write(buffer, 0, read);
                    remaining -= read;
                }
                fos.flush();
                System.out.println("Saved to " + outFile.getAbsolutePath());
            }

        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + server);
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
