/*
Problem: Rearrange Array in Maximum-Minimum Form (Alternating)
Link: https://www.geeksforgeeks.org/problems/-rearrange-array-alternately-1587115620/1
Pattern: Array Simulation / In-place Logic
Approach: Given a sorted array, rearrange so it alternates max, min, second-max, second-min, etc. The O(1) space trick: encode two numbers into one slot using arr[i] = arr[i] + (arr[j] % maxElement) * maxElement, then decode in a second pass by dividing by maxElement. Avoids needing a second array entirely.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int n = arr.length;
        int max = n - 1;
        int min = 0;
        int M = arr[n - 1] + 1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                arr[i] += (arr[max] % M) * M;
                max--;
            }else{
                arr[i] += (arr[min] % M) * M;
                min++;
            }
        }
        for(int i = 0; i < n; i++){
            arr[i] /= M;
        }
    }
}
