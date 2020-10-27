import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=621 lang=java
 *
 * [621] 任务调度器
 */

// @lc code=start
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] letters = new int[26];
        for (char c : tasks)
            letters[c - 'A']++;
        Arrays.sort(letters);
        /* int times = 0;
        while (letters[25] > 0) {
            int i = 0;
            while (i <= n) {
                if (letters[25] <= 0)
                    break;
                if (i < 26 && letters[25 - i] > 0) 
                    letters[25 - i]--;
                i++;
                times++;
            }
            Arrays.sort(letters);
        }
        return times; */
        int maxv = letters[25] - 1;
        int remain = n * maxv;
        for (int i = 24; i >= 0; i--) {
            remain -= Math.min(letters[i], maxv);
        }
        return remain > 0 ? remain + tasks.length : tasks.length;
    }
}
// @lc code=end

