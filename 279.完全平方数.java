import java.util.Queue;

/*
 * @lc app=leetcode.cn id=279 lang=java
 *
 * [279] 完全平方数
 */

// @lc code=start
class Solution {

    public int numSquares(int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<Integer>();
        int res = 0;
        queue.offer(n);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int temp = queue.poll();
                visited[temp] = true;
                if (temp == 0)
                    return res;
                for (int j = (int)Math.sqrt(temp); j >= 1; j--) {
                    if (!visited[temp - j * j])
                        queue.offer(temp - j * j);
                }
            }
            res++;
        }
        return res;
    }
}
// @lc code=end

