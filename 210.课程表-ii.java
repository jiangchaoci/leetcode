/*
 * @lc app=leetcode.cn id=210 lang=java
 *
 * [210] 课程表 II
 */

// @lc code=start
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        int[] res = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<>());
        for (int[] pre : prerequisites) {
            inDegree[pre[0]]++;
            adj.get(pre[1]).add(pre[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0)
                queue.offer(i);
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            res[count++] = node;
            for (int next : adj.get(node)) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        if (count == numCourses)
            return res;
        return new int[0];
    }
}
// @lc code=end

