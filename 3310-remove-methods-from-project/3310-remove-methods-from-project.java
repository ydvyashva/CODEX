import java.util.*;

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        // Build adjacency list for graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : invocations) {
            graph.get(edge[0]).add(edge[1]);
        }

        // Step 1: Find all suspicious methods starting from k
        boolean[] isSuspicious = new boolean[n];
        dfs(k, graph, isSuspicious);

        // Step 2: Check if any non-suspicious method invokes a suspicious method
        for (int[] edge : invocations) {
            int u = edge[0];
            int v = edge[1];
            if (!isSuspicious[u] && isSuspicious[v]) {
                // Cannot remove suspicious methods; return all methods
                List<Integer> allMethods = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    allMethods.add(i);
                }
                return allMethods;
            }
        }

        // Step 3: Return only non-suspicious methods
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!isSuspicious[i]) {
                result.add(i);
            }
        }
        return result;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] isSuspicious) {
        isSuspicious[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!isSuspicious[neighbor]) {
                dfs(neighbor, graph, isSuspicious);
            }
        }
    }
}