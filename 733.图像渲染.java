/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {
    private int[][] next = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private void dfs(int[][] image, int sr, int sc, int begColor, int newColor) {
        image[sr][sc] = newColor;
        for (int i = 0; i < next.length; i++) {
            int newX = sr + next[i][0];
            int newY = sc + next[i][1];
            if (newX >= 0 && newX < image.length && newY >= 0 
                && newY < image[0].length && image[newX][newY] == begColor) {
                    dfs(image, newX, newY, begColor, newColor);
                }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor)
            return image;
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
}
// @lc code=end

