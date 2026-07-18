/*
Problem: Find the Missing and Repeating Number
Pattern: Array Simulation / In-place Logic
Approach: No hashmap allowed for the O(1) space version. Use the array itself as a hashmap: for each value v, go to index (v-1) and negate the value there. If you land on an already-negative value, that index+1 is your repeating number. The one index that never got negated at the end is your missing number.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
