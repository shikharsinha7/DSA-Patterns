/*
Problem: Reverse Linked List (LeetCode 206)
Link: https://leetcode.com/problems/reverse-linked-list/description/
Pattern: Linked List
Approach: Use three pointers — prev, curr, and next. Save curr's next node before you break the link, point curr back to prev, then shift everything one step forward.
Time: O(n) | Space: O(1)
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }
}
