import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    private boolean[][] visited = null;
    private boolean dfs(char[][]board, int i, int j, int start, String word) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length 
            || start >= word.length() || visited[i][j] == true || board[i][j] != word.charAt(start)) 
            return false;
        if (start == word.length() - 1) return true;
        visited[i][j] = true;
        if (dfs(board, i + 1, j, start + 1, word)) return true;
        if (dfs(board, i - 1, j, start + 1, word)) return true;
        if (dfs(board, i, j + 1, start + 1, word)) return true;
        if (dfs(board, i, j - 1, start + 1, word)) return true;
        visited[i][j] = false;
        return false;
    }
    public boolean exist(char[][] board, String word) {
        visited = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0;j < board[i].length; j++) {
                for (int k = 0; k < visited.length; k++) {
                    for (int m = 0; m < visited[k].length; m++)
                        visited[k][m] = false;
                }
                if (dfs(board, i, j, 0, word)) return true;
            }
        }
        return false;
    }
}
// @lc code=end

