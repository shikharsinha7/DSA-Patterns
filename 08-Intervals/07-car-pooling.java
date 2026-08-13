/*
Problem: Car Pooling (LeetCode 1094)
Pattern: Intervals
Approach: Treat each trip as a range where capacity changes — add passengers at the pickup point, remove them at the drop-off point. Sort these change-points by location and sweep through, tracking running capacity. If it ever exceeds the car's limit, return false.
Time: O(n log n) | Space: O(n)
*/

// code goes here once solved
