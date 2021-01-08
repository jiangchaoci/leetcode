/*
 * @lc app=leetcode.cn id=318 lang=java
 *
 * [318] 最大单词长度乘积
 */

// @lc code=start
class Solution {
    private boolean check(String word1, String word2) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            count1[word1.charAt(i)-'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            count2[word2.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count1[i] > 0 && count2[i] > 0)
                return false;
        }
        return true;
    }
    public int maxProduct(String[] words) {
        int res = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (check(words[i], words[j])) {
                    res = Math.max(res, words[i].length()*words[j].length());
                }
            }
        }
        return res;
    }
}
// @lc code=end

