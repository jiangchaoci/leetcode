/*
 * @lc app=leetcode.cn id=1042 lang=java
 *
 * [1042] 不邻接植花
 */

// @lc code=start
class Solution {
    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] res = new int[N];
        boolean[] flower = new boolean[4];
        res[0] = 1;
        boolean[][] adj = new boolean[N][N];
        for (int[] path : paths) {
            adj[path[0]-1][path[1]-1] = true;
            adj[path[1]-1][path[0]-1] = true;
        }
        for (int i = 1; i < N; i++) {
            Arrays.fill(flower, false);
            for (int j = 0; j < i; j++) {
                if (adj[i][j]) {
                    flower[res[j]-1] = true;
                }
            }
            for (int j = 0; j < 4; j++) {
                if (!flower[j])
                    res[i] = j+1;
            }
        }
        return res;
    }
}
// @lc code=end

