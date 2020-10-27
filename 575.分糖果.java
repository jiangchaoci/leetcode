import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candies) {
        HashSet<Integer> set = new HashSet<>();
        for (int candie : candies) {
            set.add(candie);
        }
        return Math.min(candies.length / 2, set.size());
    }
}
// @lc code=end

