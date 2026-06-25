/*
Problem: Task Scheduler (LeetCode 621)
Pattern: Heap / Priority Queue / Top K
Approach: Max heap based on task frequency. Greedily schedule the most frequent remaining task each round, and use a small cooldown queue to hold tasks that can't be reused yet.
Time: O(n) since fixed 26 letters | Space: O(1) effectively (26 letters max)
*/

// code goes here once solved
