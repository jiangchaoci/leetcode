/*
 * @lc app=leetcode.cn id=953 lang=java
 *
 * [953] 验证外星语词典
 */

// @lc code=start
class Solution {
    private boolean check(String word1, String word2, int[] index) {
        int p1 = 0, p2 = 0;
        while (p1 < word1.length() && p2 < word2.length()) {
            if (word1.charAt(p1) == word2.charAt(p2)) {
                p1++;
                p2++;
            } else {
                int index1 = index[word1.charAt(p1) - 'a'];
                int index2 = index[word2.charAt(p2) - 'a'];
                if (index1 > index2)
                    return false;
                else
                    return true;
            }
        }
            
        if (p1 < word1.length() && p2 == word2.length())
            return false;
        return true;
    }

    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); i++) {
            index[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < words.length - 1; i++) {
            if (!check(words[i], words[i+1], index))
                return false;
        }
        return true;
    }
}
// @lc code=end

