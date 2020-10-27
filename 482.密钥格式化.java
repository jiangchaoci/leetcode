/*
 * @lc app=leetcode.cn id=482 lang=java
 *
 * [482] 密钥格式化
 */

// @lc code=start
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String[] strs = S.split("-");
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++)
            sb.append(strs[i].toUpperCase());
        int index = sb.length() % K;
        res.append(sb.substring(0, index));
        while (index < sb.length()) {
            if (res.length() > 0)
                res.append("-");
            res.append(sb.substring(index, Math.min(index + K, sb.length())));
            index = Math.min(index + K, sb.length());
        }
        return res.toString();
    }
}
// @lc code=end

