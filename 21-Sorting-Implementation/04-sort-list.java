/*
Problem: Sort List (LeetCode 148)
Link: https://leetcode.com/problems/sort-list/description/
Pattern: Sorting (Implementation Level)
Approach: Merge sort adapted for a linked list — find the middle using fast/slow pointers, recursively sort each half, then merge the two sorted halves back together.
Time: O(n log n) | Space: O(log n) recursion (O(1) extra otherwise)
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
    public ListNode sortList(ListNode head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        ListNode left = head;
        ListNode right = getMid(head);

        // Split the list into two halves
        ListNode temp = right.next;
        right.next = null;
        right = temp;

        // Recursively sort both halves
        left = sortList(left);
        right = sortList(right);

        // Merge the two sorted halves
        return merge(left, right);
    }

    private ListNode getMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode merge(ListNode left, ListNode right) {
        // Dummy node makes it easier to build the result
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }

            curr = curr.next;
        }

        // Attach whichever list still has nodes
        if (left != null) {
            curr.next = left;
        } else {
            curr.next = right;
        }

        return dummy.next;
    }
}
