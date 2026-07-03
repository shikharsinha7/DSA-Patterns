/*
Problem: Valid Anagram (LeetCode 242)
Link: https://leetcode.com/problems/valid-anagram/description/
Pattern: Arrays and Hashing
Approach: Count how many times each letter shows up in both strings (using a hashmap or just a size-26 array since it's lowercase letters), then check both counts match.
Time: O(n) | Space: O(1) (fixed 26 letters)
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            freq[ch - 'a']--;
        }
        for (int val : freq) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}