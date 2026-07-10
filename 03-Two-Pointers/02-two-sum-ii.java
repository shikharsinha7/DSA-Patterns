/*
Problem: Two Sum II (LeetCode 167)
Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
Pattern: Two Pointers
Approach: Since the array is already sorted, put one pointer at the start and one at the end. If the sum is too big move the right pointer left, if too small move the left pointer right.
Time: O(n) | Space: O(1)
*/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(right > left){
            if(numbers[right] + numbers[left] == target){
                return new int[]{left+1, right+1};
            }else if(numbers[left] + numbers[right] < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[2];
    }
}
