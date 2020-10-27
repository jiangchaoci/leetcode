/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode root = new ListNode(0);
        root.next = head;
        ListNode cur = head;
        ListNode pre = root;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
                cur = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }
        }

        return root.next;
    }
}
// @lc code=end

