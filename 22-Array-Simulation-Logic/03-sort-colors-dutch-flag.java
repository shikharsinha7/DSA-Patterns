/*
Problem: Sort Colors / Dutch National Flag (LeetCode 75)
Pattern: Array Simulation / In-place Logic
Approach: Three pointers - low, mid, high. Walk mid through the array: if arr[mid] is 0, swap with low and advance both low and mid; if 2, swap with high and shrink high (don't advance mid, since the swapped-in value needs checking); if 1, just advance mid. One pass, three-way partition, no extra space.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
