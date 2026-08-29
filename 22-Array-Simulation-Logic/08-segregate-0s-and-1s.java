/*
Problem: Segregate 0s and 1s in a Binary Array
Link: https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1
Pattern: Array Simulation / In-place Logic
Approach: Simplified two-pointer partition - left pointer starts at 0, right at n-1. Move left forward while you see 0s, move right backward while you see 1s, then swap when both are stuck, and continue. Essentially a 2-way version of Dutch National Flag.
Time: O(n) | Space: O(1)
*/

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int one = arr.length - 1;
        int zero = 0;
        while(zero < one){
            while(zero < one && arr[zero] != 1){
                zero++;
            }
            while(zero < one && arr[one] != 0){
               one--;
            }
            int temp = arr[zero];
            arr[zero] = arr[one];
            arr[one] = temp;
        }
    }
}

