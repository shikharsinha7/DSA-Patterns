/*
Problem: Merge K Sorted Lists (LeetCode 23)
Pattern: Heap / Priority Queue / Top K
Approach: Min heap holding the current head node of every list. Keep popping the smallest, adding it to the result, and pushing that list's next node back in if there is one.
Time: O(n log k), n = total nodes, k = number of lists | Space: O(k)
*/

// code goes here once solved
