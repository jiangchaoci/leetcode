import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=46 lang=java
 *
 * [46] 全排列
 */

// @lc code=start
class Solution {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();

    private void backtrack(Set<Integer> set, List<Integer> added) {
        if (set.size() == 0) {
            List<Integer> temp = new ArrayList<Integer>(added);
            res.add(temp);
            return;
        }
        List<Integer> a = new ArrayList<>(set);
        for (int num : a) {
            added.add(num);
            set.remove(num);
            backtrack(set, added);
            set.add(num);
            added.remove(added.size() - 1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        backtrack(set, new ArrayList<Integer>());
        return res;
    }
}
// @lc code=end

