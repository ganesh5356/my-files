package internal_practise;

import java.util.Scanner; 

public class prims { 
  
    static final int INF = 9999; 
    static final int MAX = 20; 
    static int[][] G = new int[MAX][MAX]; 
    static int[][] spanning = new int[MAX][MAX]; 
    static int n; 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.print("Enter the number of vertices: "); 
        n = scanner.nextInt(); 
 
        System.out.println("\nEnter the adjacency matrix:"); 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                G[i][j] = scanner.nextInt(); 
            } 
        } 
 
        int totalCost = prims(); 
 
        System.out.println("\nSpanning tree matrix:"); 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                System.out.print(spanning[i][j] + "\t"); 
            } 
            System.out.println(); 
        } 
 
        System.out.println("\nTotal cost of the spanning tree = " + 
totalCost); 
    } 
 
    static int prims() { 
        int[][] cost = new int[MAX][MAX]; 
        int[] distance = new int[MAX]; 
        int[] from = new int[MAX]; 
        int[] visited = new int[MAX]; 
        int minCost = 0; 
 
        // Create the cost matrix and initialize the spanning matrix 
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                if (G[i][j] == 0) { 
                    cost[i][j] = INF; 
                } else { 
                    cost[i][j] = G[i][j]; 
                } 
                spanning[i][j] = 0; 
            } 
        } 
 
        // Initialize distance, visited, and from arrays 
        distance[0] = 0; 
        visited[0] = 1; 
        for (int i = 1; i < n; i++) { 
            distance[i] = cost[0][i]; 
            from[i] = 0; 
            visited[i] = 0; 
        } 
 
        int noOfEdges = n - 1; 
 
        while (noOfEdges > 0) { 
            int minDistance = INF, v = -1; 
 
            // Find the vertex at the minimum distance from the tree 
            for (int i = 1; i < n; i++) { 
                if (visited[i] == 0 && distance[i] < minDistance) { 
                    v = i; 
                    minDistance = distance[i]; 
                } 
            } 
 
            int u = from[v]; 
 
            // Add the edge to the spanning tree 
            spanning[u][v] = distance[v]; 
            spanning[v][u] = distance[v]; 
            noOfEdges--; 
            visited[v] = 1; 
 
            // Update the distance array 
            for (int i = 1; i < n; i++) { 
                if (visited[i] == 0 && cost[i][v] < distance[i]) { 
                    distance[i] = cost[i][v]; 
                    from[i] = v; 
                } 
            } 
 
            minCost += cost[u][v]; 
        } 
 
        return minCost; 
    } 
} 