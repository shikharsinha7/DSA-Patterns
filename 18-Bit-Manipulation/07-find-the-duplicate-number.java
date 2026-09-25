/*
Problem: Find the Duplicate Number (LeetCode 287)
Link: https://leetcode.com/problems/find-the-duplicate-number/description/
Pattern: Bit Manipulation
Approach: Same Floyd's cycle detection idea as in the Linked List pattern — treat array values as pointers to the next index and find where the cycle begins.
Time: O(n) | Space: O(1)
*/

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        int slow2 = 0;

        while (true) {
            slow = nums[slow];
            slow2 = nums[slow2];

            if (slow == slow2) {
                return slow;
            }
        }
    }
}
