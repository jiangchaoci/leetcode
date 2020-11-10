/*
 * @lc app=leetcode.cn id=1636 lang=java
 *
 * [1636] 按照频率将数组升序排序
 */
import java.util.Arrays;
// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        int[][] temp = new int[nums.length][2];
        int[] freq = new int[201];
        for (int num : nums) {
            freq[num+100]++;
        }
        for (int i = 0; i < nums.length; i++) {
            temp[i][0] = nums[i];
            temp[i][1] = freq[nums[i]+100];
        }
        Arrays.sort(temp, (a,b)->b[0]-a[0]);
        Arrays.sort(temp, (a,b)->a[1]-b[1]);
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            res[i] = temp[i][0];
        }
        return res;
    }
}
// @lc code=end

