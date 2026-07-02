/*
Problem: Longest Substring Without Repeating Characters (LeetCode 3)
Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
Pattern: Sliding Window
Approach: Sliding window with a hashset tracking characters currently in the window. Expand the window to the right, and when you hit a duplicate, shrink from the left until it's gone.
Time: O(n) | Space: O(min(n, charset size))
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < s.length(); right++) {
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
