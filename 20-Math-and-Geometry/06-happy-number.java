/*
Problem: Happy Number (LeetCode 202)
Link: https://leetcode.com/problems/happy-number/description/
Pattern: Math and Geometry
Approach: Repeatedly compute the sum of squares of the digits. Use fast/slow pointers (or a hashset) to detect if you've entered a cycle that isn't 1.
Time: O(log n) per iteration roughly | Space: O(1) with fast/slow pointers
*/

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);

        while(fast != 1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
    private int getNext(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
