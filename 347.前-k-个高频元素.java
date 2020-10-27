

/*
 * @lc app=leetcode.cn id=347 lang=java
 *
 * [347] 前 K 个高频元素
 */

// @lc code=start
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        if (k == 0) return res;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[][] keyvalues = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            keyvalues[i][0] = entry.getKey();
            keyvalues[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(keyvalues, (first, second) -> second[1] - first[1]);
        for (int j = 0; j < k; j++) {
            res[j] = keyvalues[j][0];
        }
        return res;
    }
}
// @lc code=end

