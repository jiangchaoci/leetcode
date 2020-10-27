import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        int left = 0, right = s.length() - 1;
        char[] cs = s.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        while (left < right) {
            while (left < right && !set.contains(cs[left])) left++;
            while (right > left && !set.contains(cs[right])) right--;
            if (left == right) break;
            char c = cs[left];
            cs[left++] = cs[right];
            cs[right--] = c;
        }
        return String.valueOf(cs);
    }
}
// @lc code=end

