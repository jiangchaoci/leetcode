import java.util.List;

/*
 * @lc app=leetcode.cn id=234 lang=java
 *
 * [234] 回文链表
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            int num1 = list.get(left);
            int num2 = list.get(right);
            if (num1 != num2) return false;
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

