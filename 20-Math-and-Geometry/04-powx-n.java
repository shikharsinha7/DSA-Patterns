/*
Problem: Pow(x, n) (LeetCode 50)
Link: https://leetcode.com/problems/powx-n/description/
Pattern: Math and Geometry
Approach: Fast exponentiation using divide and conquer — x^n = (x^(n/2))^2, halving the exponent on every recursive call instead of multiplying n times.
Time: O(log n) | Space: O(log n) recursion (O(1) iterative)
*/

class Solution {
    public double myPow(double x, int n) {
        long pow = n;
        if(n < 0){
            x = 1 / x;
            pow = -pow;
        }
        double ans = 1;
        while(pow > 0){
            if(pow % 2 == 1){
                ans *= x;
            }
            x *= x;
            pow /= 2;
        }
        return ans;
    }
}
