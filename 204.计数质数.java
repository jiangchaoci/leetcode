import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */

// @lc code=start
class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < n; j+=i)
                    isPrime[j] = false;
            }
        }
        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i])
                ans++;
        }
        return ans;
    }
}
// @lc code=end

