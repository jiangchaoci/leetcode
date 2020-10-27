/*
 * @lc app=leetcode.cn id=1071 lang=java
 *
 * [1071] 字符串的最大公因子
 */

// @lc code=start
class Solution {
    /**
     * 
     * @param str1 被除数
     * @param str2 除数
     * @return
     */
    private boolean canDiv(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        if (len1 % len2 != 0)
            return false;
        int times = len1 / len2;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < times; i ++) {
            temp.append(str2);
        }
        return str1.equals(temp.toString());
    }
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length(), len2 = str2.length();
        String maxStr, minStr;
        if (len1 >= len2) {
            maxStr = str1;
            minStr = str2;
        } else {
            maxStr = str2;
            minStr = str1;
        }
        for (int i = minStr.length(); i >= 1; i--) {
            if (len1%i != 0 || len2%i != 0)
                continue;
            for (int j = 0; j < minStr.length() - i + 1; j++) {
                String str = minStr.substring(j, j+i);
                if (canDiv(maxStr, str) && canDiv(minStr, str))
                    return str;
            }
        }
        return "";
    }
}
// @lc code=end

