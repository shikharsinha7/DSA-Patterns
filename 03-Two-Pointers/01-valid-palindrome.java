/*
Problem: Valid Palindrome (LeetCode 125)
Link: https://leetcode.com/problems/valid-palindrome/description/
Pattern: Two Pointers
Approach: Two pointers, one at the start, one at the end. Skip over anything that's not a letter/number, compare lowercase versions, and move both pointers inward until they meet.
Time: O(n) | Space: O(1)
*/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right){
            while(left < right && !isAlphaNum(s.charAt(left))) left++;
            while(left < right && !isAlphaNum(s.charAt(right))) right--;

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
    private boolean isAlphaNum(char ch){
        if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'|| ch >= '0' && ch <= '9'){
            return true;
        }
        return false;
    }
}
