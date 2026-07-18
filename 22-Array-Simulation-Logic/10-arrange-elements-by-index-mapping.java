/*
Problem: Rearrange Array So That arr[i] Becomes arr[arr[i]]
Pattern: Array Simulation / In-place Logic
Approach: Classic index-encoding trick. Since all values are in range [0, n-1], encode two pieces of information into one slot using arr[i] += (arr[arr[i]] % n) * n, done for every index first, then decode with a final pass dividing every element by n. Avoids a second array completely.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
