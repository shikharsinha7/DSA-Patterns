/*
Problem: Fruit Into Baskets (LeetCode 904)
Pattern: Sliding Window
Approach: Sliding window that's only allowed to have 2 distinct fruit types inside, tracked with a hashmap of counts. Shrink the window from the left whenever a 3rd type shows up.
Time: O(n) | Space: O(1) (max 3 types tracked at once)
*/

// code goes here once solved
