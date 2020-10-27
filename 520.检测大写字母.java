/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) return true;
        char c = word.charAt(0);
        if (Character.isUpperCase(c)) {
            char d = word.charAt(1);
            if (Character.isUpperCase(d)) {
                for (int i = 2; i < word.length(); i++) {
                    char e = word.charAt(i);
                    if (Character.isLetter(e)) {
                        if (Character.isLowerCase(e))
                            return false;
                    }
                }
            } else {
                for (int i = 2; i < word.length(); i++) {
                    char e = word.charAt(i);
                    if (Character.isLetter(e)) {
                        if (Character.isUpperCase(e))
                            return false;
                    }
                }
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                char e = word.charAt(i);
                if (Character.isLetter(e)) {
                    if (Character.isUpperCase(e))
                        return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

