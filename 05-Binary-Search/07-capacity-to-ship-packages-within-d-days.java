/*
Problem: Capacity To Ship Packages Within D Days (LeetCode 1011)
Link: https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
Pattern: Binary Search
Approach: Binary search on the ship's capacity (from the heaviest single package up to the sum of all weights). For each candidate capacity, greedily check how many days it'd take, and find the smallest capacity that fits within D days.
Time: O(n log(sum of weights)) | Space: O(1)
*/

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        for(int weight : weights){
            left = Math.max(weight, left);
        }
        int right = 0;
        for(int weight : weights){
            right += weight;
        }
        int result = right;
        while(left <= right){
            int capacity = left + (right - left) / 2;
            if(canShip(weights, days, capacity)){
                result = Math.min(result, capacity);
                right = capacity - 1;
            }else{
                left = capacity + 1;
            }
        }
        return result;
    }
    private boolean canShip(int[] weights, int days, int capacity){
        int ships = 1;
        int currentCapacity = capacity;
        for(int weight : weights){
            if(currentCapacity < weight){
                ships++;
                currentCapacity = capacity;
            }
            currentCapacity -= weight;
        }
        return ships <= days;
    }
}
