/*
 * @lc app=leetcode.cn id=299 lang=java
 *
 * [299] 猜数字游戏
 */

// @lc code=start
class Solution {
    public String getHint(String secret, String guess) {
        int[] count = new int[10];
        int sum = 0;
        for (int i = 0; i < secret.length(); i++) {
            count[secret.charAt(i) - '0']++;
        }
        for (int i = 0; i < guess.length(); i++) {
            if (count[guess.charAt(i) - '0'] > 0) {
                sum++;
                count[guess.charAt(i) - '0']--;
            }
        }
        int sum1 = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i))
                sum1++;
        }
        return sum1 + "A" + (sum - sum1) + "B";
    }
}
// @lc code=end

