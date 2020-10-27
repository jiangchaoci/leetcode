/*
 * @lc app=leetcode.cn id=859 lang=java
 *
 * [859] 亲密字符串
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())
            return false;
        int[] letterA = new int[26];
        int[] letterB = new int[26];
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i))
                count++;
            letterA[A.charAt(i) - 'a']++;
            letterB[B.charAt(i) - 'a']++;
        }
        if (count == 0) {
            for (int i = 0; i < 26; i++) {
                if (letterA[i] >= 2)
                    return true;
            }
            return false;
        } else if (count == 2) {
            for (int i = 0; i < 26; i++) {
                if (letterA[i] != letterB[i])
                    return false;
            }
            return true;
        }
        return false;
    }
}
// @lc code=end

