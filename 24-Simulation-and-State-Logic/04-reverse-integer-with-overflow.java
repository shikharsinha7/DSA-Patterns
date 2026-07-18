/*
Problem: Reverse Integer, With Overflow Handling (LeetCode 7)
Pattern: Simulation / Step-by-Step State Logic
Approach: Pop digits off the end using modulo and division, push them onto a running result using multiply and add - but check for overflow BEFORE each multiply/add step (comparing against Integer.MAX_VALUE / 10 boundaries) since the overflow itself would corrupt the value if checked after.
Time: O(log n) | Space: O(1)
*/

// code goes here once solved
