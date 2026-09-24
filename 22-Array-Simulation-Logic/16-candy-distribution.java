/*
Problem: Candy Distribution (LeetCode 135)
Link: https://leetcode.com/problems/candy/description/
Pattern: Array Simulation / In-place Logic
Approach: Two-pass greedy, no data structure. First pass left to right: give a child one more candy than their left neighbor if their rating is higher. Second pass right to left: give a child more than their right neighbor if their rating is higher, taking the max of what's already assigned. Sum both passes for the final answer.
Time: O(n) | Space: O(n) for the candy array (can be reduced to O(1) with a more clever single-pass slope-tracking approach if you want the harder version)
*/

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for(int i = 1; i < n; i++){
            if(ratings[i - 1] < ratings[i]){
                arr[i] = arr[i - 1] + 1;
            }
        }

        for(int i = n - 2; i >= 0; i--){
            if(ratings[i] > ratings[i + 1]){
                arr[i] = Math.max(arr[i], arr[i + 1] + 1);
            }
        }
        int sum = 0;
        for(int num : arr){
            sum += num;        
        }
        return sum;
    }
}
