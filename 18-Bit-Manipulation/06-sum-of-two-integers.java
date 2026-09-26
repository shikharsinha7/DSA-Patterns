/*
Problem: Sum of Two Integers (LeetCode 371)
Link: https://leetcode.com/problems/sum-of-two-integers/description/
Pattern: Bit Manipulation
Approach: Simulate addition manually using XOR for the sum-without-carry part and AND+shift for the carry part, repeating until there's no carry left.
Time: O(32) i.e. O(1) | Space: O(1)
*/

class Solution {
    public int getSum(int a, int b) {
        while(b != 0){
            int tmp = (a & b) << 1;
            a = a ^ b;
            b = tmp;
        }
        return a;
    }
}
