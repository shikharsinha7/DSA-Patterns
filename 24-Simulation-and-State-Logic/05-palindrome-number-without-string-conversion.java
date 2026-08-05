/*
Problem: Palindrome Number, Without Converting to String (LeetCode 9)
Link: https://leetcode.com/problems/palindrome-number/description/
Pattern: Simulation / Step-by-Step State Logic
Approach: Negative numbers and numbers ending in 0 (except 0 itself) can never be palindromes - handle those upfront. Then reverse only the second half of the number using modulo/division, and compare it against the remaining first half, stopping once the reversed half becomes >= the remaining original half.
Time: O(log n) | Space: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        int div = 1;
        while(x / div >= 10){
            div *= 10;
        }
        while(x != 0){
            if(x / div != x % 10){
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
