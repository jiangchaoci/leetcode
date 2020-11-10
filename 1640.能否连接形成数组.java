/*
 * @lc app=leetcode.cn id=1640 lang=java
 *
 * [1640] 能否连接形成数组
 */
import java.util.Arrays;
// @lc code=start
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int[] location = new int[100];
        Arrays.fill(location, -1);
        for (int i = 0; i < arr.length; i++) {
            location[arr[i]-1] = i;
        }
        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (location[pieces[i][j]-1] == -1) {
                    return false;
                }
            }
        }
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i].length > 1) {
                for (int j = 0; j < pieces[i].length-1; j++) {
                    int loc1 = location[pieces[i][j]-1];
                    int loc2 = location[pieces[i][j+1]-1];
                    if (loc1 != loc2-1) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
// @lc code=end

