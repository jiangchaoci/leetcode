import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode.cn id=350 lang=java
 *
 * [350] 两个数组的交集 II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            int count = map.getOrDefault(nums2[i], 0);
            if (count > 0) {
                ans.add(nums2[i]);
                map.put(nums2[i], count-1);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}
// @lc code=end

