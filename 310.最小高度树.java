/*
 * @lc app=leetcode.cn id=310 lang=java
 *
 * [310] 最小高度树
 */

// @lc code=start
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        if (n <= 2) {
            List<Integer> temp = new ArrayList<Integer>();
            for (int i = 0; i < n; i++)
                temp.add(i);
            return temp;
        }
        for (int[] edge : edges) {
            list.get(edge[0]).add(edge[1]);
            list.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[n];
        int minHeight = Integer.MAX_VALUE;
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (list.get(i).size() <= 1) continue;
            Arrays.fill(visited, false);
            int height = 0;
            queue.offer(i);
            while (!queue.isEmpty()) {
                int size = queue.size();
                height++;
                for (int k = 0; k < size; k++) {
                    int node = queue.poll();
                    visited[node] = true;
                    for (int num : list.get(node)) {
                        if (!visited[num])
                            queue.offer(num);
                    }
                }
            }
            if (height < minHeight) {
                minHeight = height;
                res.clear();
                res.add(i);
            } else if (height == minHeight) {
                res.add(i);
            }
        }
        return res;
    }
}
// @lc code=end

