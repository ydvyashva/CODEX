import java.util.*;

class Solution {
    private int vertices;
    private int edges;

    public int countCompleteComponents(int n, int[][] edges) {
        List<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int completeComponents = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                vertices = 0;
                this.edges = 0;

                dfs(i, graph, visited);

                int actualEdges = this.edges / 2;
                int expectedEdges = vertices * (vertices - 1) / 2;

                if (actualEdges == expectedEdges) {
                    completeComponents++;
                }
            }
        }

        return completeComponents;
    }

    private void dfs(int node, List<Integer>[] graph, boolean[] visited) {
        visited[node] = true;
        vertices++;
        edges += graph[node].size();

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }
}