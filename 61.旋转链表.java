/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        if (len == 1) return head;
        k = k % len;
        if (k == 0) return head;
        k = len - k;
        ListNode bef = null;
        cur = head;
        for (int i = k; i > 0; i--) {
            bef = cur;
            cur = cur.next;
        }
        bef.next = null;
        ListNode temp = cur;
        while (temp.next != null)
            temp = temp.next;
        temp.next = head;
        return cur;
    }
}
// @lc code=end

