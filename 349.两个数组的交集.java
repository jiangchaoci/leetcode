import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) set.add(nums1[i]);
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
// @lc code=end

