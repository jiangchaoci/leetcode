/*
 * @lc app=leetcode.cn id=316 lang=java
 *
 * [316] 去除重复字母
 */

// @lc code=start
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i)-'a']++;
        StringBuilder sb = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            if (count[i] <= 1)
                continue;
            for (int j = 0; j < s.length(); j++) {
                if (s.)
            }
            s = sb.toString();
        }
    }
}
// @lc code=end

