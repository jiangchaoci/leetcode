/*
 * @lc app=leetcode.cn id=373 lang=java
 *
 * [373] 查找和最小的K对数字
 */

// @lc code=start
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int[][] temp = new int[nums1.length*nums2.length][2];
        int cur = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                temp[cur][0] = nums1[i];
                temp[cur++][1] = nums2[j];
            }
        }
        Arrays.sort(temp, (x,y)->(x[0]+x[1])-(y[0]+y[1]));
        for (int i = 0; i < temp.length; i++) {
            if (k <= 0)
                break;
            List<Integer> temp1 = new ArrayList<>();
            temp1.add(temp[i][0]);
            temp1.add(temp[i][1]);
            res.add(temp1);
            k--;
        }
        return res;
    }
}
// @lc code=end

