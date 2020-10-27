import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=788 lang=java
 *
 * [788] 旋转数字
 */

// @lc code=start
class Solution {
    HashSet<Integer> zishen = new HashSet<>();
    HashSet<Integer> youxiao = new HashSet<>();
    private boolean check(int N) {
        int yx = 0;
        while (N > 0) {
            int temp = N % 10;
            if (youxiao.contains(temp)) {
                yx ++;
            } else if (zishen.contains(temp)) {

            } else {
                return false;
            }
            N = N / 10;
        }
        if (yx == 0) return false;
        return true;
    }
    public int rotatedDigits(int N) {
        zishen.add(0);
        zishen.add(1);
        zishen.add(8);
        youxiao.add(2);
        youxiao.add(5);
        youxiao.add(6);
        youxiao.add(9);
        int res = 0;
        for (int i = 2; i <= N; i++) {
            if (check(i))
                res++;
        }
        return res;
    }
}
// @lc code=end

