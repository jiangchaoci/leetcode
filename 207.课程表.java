import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=207 lang=java
 *
 * [207] 课程表
 */

// @lc code=start
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
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
            count++;
            for (int next : adj.get(node)) {
                inDegree[next]--;
                if (inDegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }
        if (count == numCourses)
            return true;
        else return false;
    }
}
// @lc code=end

