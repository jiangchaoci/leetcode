/*
 * @lc app=leetcode.cn id=167 lang=java
 *
 * [167] 两数之和 II - 输入有序数组
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        int[] ans = new int[2];
        while (left < right) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                ans[0] = left+1;
                ans[1] = right+1;
                break;
            }
        }
        return ans;
    }
}
// @lc code=end

