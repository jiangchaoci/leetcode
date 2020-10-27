/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 */

// @lc code=start
class Solution {
    private int getNext(int n) {
        int ans = 0;
        while (n > 0) {
            ans += (n % 10) * (n % 10);
            n /= 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow = getNext(n);
        int fast = getNext(getNext(n));
        while (slow != fast) {
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return slow == 1;
    }
}
// @lc code=end

