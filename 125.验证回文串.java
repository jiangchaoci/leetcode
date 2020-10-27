/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        int left = 0;
        int right = sb.length() - 1;
        String str = sb.toString().toLowerCase();
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

