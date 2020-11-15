import java.util.ArrayList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=310 lang=java
 *
 * [310] 最小高度树
 */

// @lc code=start
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if (n == 1) {
            res.add(0);
            return res;
        } else if (n == 2) {
            res.add(0);
            res.add(1);
            return res;
        }
        int[] indgree = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for (int[] edge : edges) {
            indgree[edge[0]]++;
            indgree[edge[1]]++;
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        int remain = n;
        for (int i = 0; i < n; i++) {
            if (indgree[i] == 1) {
                queue.offer(i);
                remain--;
                indgree[i] = 0;
            }
        }
        if (remain <= 2) {
            for (int i = 0; i < n; i++) {
                if (indgree[i] != 0) {
                    res.add(i);
                }
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                for (int neibor : adj.get(node)) {
                    if (indgree[neibor] != 0)
                        indgree[neibor]--;
                }
            }
            for (int i = 0; i < n; i++) {
                if (indgree[i] == 1) {
                    queue.offer(i);
                    remain--;
                    indgree[i] = 0;
                }
            }
            if (remain <= 2)
                break;
        }
        for (int i = 0; i < n; i++) {
            if (indgree[i] != 0) {
                res.add(i);
            }
        }
        return res;
    }
}
// @lc code=end

