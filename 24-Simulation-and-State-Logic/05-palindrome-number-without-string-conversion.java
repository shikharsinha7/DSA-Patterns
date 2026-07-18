/*
Problem: Palindrome Number, Without Converting to String (LeetCode 9)
Pattern: Simulation / Step-by-Step State Logic
Approach: Negative numbers and numbers ending in 0 (except 0 itself) can never be palindromes - handle those upfront. Then reverse only the second half of the number using modulo/division, and compare it against the remaining first half, stopping once the reversed half becomes >= the remaining original half.
Time: O(log n) | Space: O(1)
*/

// code goes here once solved
