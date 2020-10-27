/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] smallLetters = new int[26];
        int[] bigLetters = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                smallLetters[c - 'a']++;
            } else if (Character.isUpperCase(c)) {
                bigLetters[c - 'A']++;
            }
        }
        int sum = 0;
        boolean flag = false;
        for (int i = 0; i < 26; i++) {
            sum += smallLetters[i] / 2 * 2;
            sum += bigLetters[i] / 2 * 2;
            if (!flag && smallLetters[i] % 2 == 1 || bigLetters[i] % 2 == 1) 
                flag = true;
        }
        return flag ? sum + 1 : sum;
    }
}
// @lc code=end

