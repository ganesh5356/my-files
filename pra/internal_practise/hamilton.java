package internal_practise;

import java.util.Scanner;

public class hamilton {

    private int V;
    private int[] path;

    // Function to check if the vertex can be added to the current path
    boolean isSafe(int v, int[][] graph, int[] path, int pos) {
        // Check if this vertex is adjacent to the previous one
        if (graph[path[pos - 1]][v] == 0)
            return false;

        // Check if the vertex is already in the path
        for (int i = 0; i < pos; i++) {
            if (path[i] == v)
                return false;
        }

        return true;
    }

    // Recursive utility function to solve the Hamiltonian Cycle problem
    boolean hamCycleUtil(int[][] graph, int[] path, int pos) {
        // Base case: If all vertices are included in the path
        if (pos == V) {
            // Check if the last vertex is connected to the first vertex
            return graph[path[pos - 1]][path[0]] == 1;
        }

        // Try different vertices as the next candidate
        for (int v = 1; v < V; v++) {
            if (isSafe(v, graph, path, pos)) {
                path[pos] = v;

                if (hamCycleUtil(graph, path, pos + 1))
                    return true;

                // Backtrack
                path[pos] = -1;
            }
        }

        return false;
    }

    // Main function to solve the Hamiltonian Cycle problem
    boolean hamCycle(int[][] graph) {
        path = new int[V];
        for (int i = 0; i < V; i++)
            path[i] = -1;

        // Start from vertex 0
        path[0] = 0;

        if (!hamCycleUtil(graph, path, 1)) {
            System.out.println("No Hamiltonian Cycle exists.");
            return false;
        }

        printSolution(path);
        return true;
    }

    // Function to print the path
    void printSolution(int[] path) {
        System.out.println("Hamiltonian Cycle found:");
        for (int i = 0; i < V; i++)
            System.out.print(path[i] + " ");
        System.out.println(path[0]); // to complete the cycle
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        hamilton h = new hamilton();

        System.out.print("Enter number of vertices: ");
        h.V = scanner.nextInt();

        int[][] graph = new int[h.V][h.V];
        System.out.println("Enter the adjacency matrix (0 or 1):");

        for (int i = 0; i < h.V; i++) {
            for (int j = 0; j < h.V; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        h.hamCycle(graph);
        scanner.close();
    }
}
