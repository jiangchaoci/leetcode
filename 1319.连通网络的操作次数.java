import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1319 lang=java
 *
 * [1319] 连通网络的操作次数
 */

// @lc code=start
class Solution {

    private void dfs(int start, boolean[] visited, List<List<Integer>> adj) {
        visited[start] = true;
        for (int next : adj.get(start)) {
            if (!visited[next])
                dfs(next, visited, adj);
        }
    }

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1)
            return -1;
        boolean[] visited = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for (int[] conn : connections) {
            adj.get(conn[0]).add(conn[1]);
            adj.get(conn[1]).add(conn[0]);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i, visited, adj);
            }
        }
        return count - 1;
    }
}
// @lc code=end

