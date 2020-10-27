import jdk.internal.org.objectweb.asm.tree.IincInsnNode;

/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */

// @lc code=start
class Solution {

    private int mySub(String s, int l, int r) {
        int count = 0;
        while (l >= 0 && r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                count++;
                l--;
                r++;
            } else break;
        }
        return count;
    }

    public int countSubstrings(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += mySub(s, i, i);
            if (i < s.length() - 1)
                res += mySub(s, i, i+1);
        }
        return res;
    }
}
// @lc code=end

