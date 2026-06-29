/*
Problem: Sliding Window Maximum (LeetCode 239)
Link: https://leetcode.com/problems/sliding-window-maximum/description/
Pattern: Sliding Window
Approach: Keep a deque (double ended queue) of indices that stays in decreasing order of value. Pop smaller values off the back when a bigger one comes in, and pop the front when it falls outside the window.
Time: O(n) | Space: O(k)
*/

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];
        int left = 0;
        int x = 0;
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int right = 0; right < nums.length; right++){
            while(!dq.isEmpty() && dq.peekLast() < nums[right]){
                dq.removeLast();
            }
            dq.addLast(nums[right]);

            if(right - left + 1 == k){
                ans[x++] = dq.peekFirst();
                if(dq.peekFirst() == nums[left]){
                    dq.removeFirst();
                }
                left++;
            }
        }
        return ans;
    }
}
