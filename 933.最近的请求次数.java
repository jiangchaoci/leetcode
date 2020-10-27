/*
 * @lc app=leetcode.cn id=933 lang=java
 *
 * [933] 最近的请求次数
 */

// @lc code=start
class RecentCounter {
    int[] pings;
    int cur;
    public RecentCounter() {
        pings = new int[10000];
        cur = 0;
    }
    
    public int ping(int t) {
        pings[cur++] = t;
        int bef = t - 3000;
        if (bef < 0)
            bef = 0;
        int index = 0;
        for (int i = 0; i < 10000; i++) {
            if (pings[i] == 0) {
                break;
            } else if (pings[i] >= bef) {
                index = i;
                break;
            }
        }
        return cur - index;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
// @lc code=end

