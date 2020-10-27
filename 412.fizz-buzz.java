import java.util.List;

/*
 * @lc app=leetcode.cn id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    ans.add("FizzBuzz");
                } else {
                    ans.add("Fizz");
                }
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                ans.add(String.valueOf(i));
            }
        }
        return ans;
    }
}
// @lc code=end

