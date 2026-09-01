/*
Problem: Rearrange Array So That arr[i] Becomes arr[arr[i]]
Link: https://www.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1
Pattern: Array Simulation / In-place Logic
Approach: Classic index-encoding trick. Since all values are in range [0, n-1], encode two pieces of information into one slot using arr[i] += (arr[arr[i]] % n) * n, done for every index first, then decode with a final pass dividing every element by n. Avoids a second array completely.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void arrange(int[] arr) {
        // code here
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int oldValue = arr[i] % n;
            arr[i] += (arr[oldValue] % n) * n;
        }
        for(int i = 0; i < n; i++){
            arr[i] /= n;
        }
    }
}
