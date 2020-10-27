/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并K个排序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode temp = null;
        while (true) {
            for (int i = 0; i < lists.length; i++) {
                if (temp == null)
            }
            boolean flag = false;
            for ( ListNode list : lists) {
                if (list.next != null) {
                    flag = true;
                    break;
                }
            }
            if (flag == false)
            break;
        }
        return res.next;
    }
}
// @lc code=end

