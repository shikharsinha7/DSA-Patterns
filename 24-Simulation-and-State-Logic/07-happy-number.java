/*
Problem: Happy Number (LeetCode 202)
Link: https://leetcode.com/problems/happy-number/
Pattern: Simulation / Step-by-Step State Logic
Approach: Repeatedly replace the number with the sum of squares of its digits - the actual challenge is detecting a cycle without a hashset (for the true O(1) space version), which is done using Floyd's slow/fast pointer cycle detection applied to this digit-transformation sequence instead of a linked list.
Time: O(log n) per transformation step | Space: O(1) with Floyd's cycle detection
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
