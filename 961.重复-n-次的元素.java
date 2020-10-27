/*
 * @lc app=leetcode.cn id=961 lang=java
 *
 * [961] 重复 N 次的元素
 */

// @lc code=start
class Solution {
    public int repeatedNTimes(int[] A) {
        int[] count = new int[10001];
        for (int num : A) {
            if (count[num] == 1)
                return num;
            count[num] = 1;
        }
        return 0;
    }
}
// @lc code=end

