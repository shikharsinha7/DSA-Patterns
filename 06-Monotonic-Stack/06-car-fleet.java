/*
Problem: Car Fleet (LeetCode 853)
Pattern: Monotonic Stack
Approach: Sort cars by starting position (closest to target first). Calculate the time each car takes to reach the target, then use a stack-like pass — if a car behind would catch up to the one ahead, they merge into one fleet.
Time: O(n log n) | Space: O(n)
*/

// code goes here once solved
