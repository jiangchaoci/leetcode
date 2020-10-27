import java.util.List;

/*
 * @lc app=leetcode.cn id=500 lang=java
 *
 * [500] 键盘行
 */

// @lc code=start
class Solution {
    public String[] findWords(String[] words) {
        int[] letters = new int[]{2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
        List<String> list = new ArrayList<String>();
        for (String word : words) {
            String lw = word.toLowerCase();
            int r = letters[lw.charAt(0) - 'a'];
            boolean flag = true;
            for (int i = 1; i < lw.length(); i++) {
                if (letters[lw.charAt(i) - 'a'] != r) {
                    flag = false;
                    break;
                }
            }
            if (flag)
                list.add(word);
        }
        String[] res = new String[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
// @lc code=end

