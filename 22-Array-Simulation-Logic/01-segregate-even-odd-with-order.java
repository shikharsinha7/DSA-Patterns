/*
Problem: Segregate Even (Ascending) and Odd (Descending) in an Array (GFG)
Link: https://www.geeksforgeeks.org/problems/sort-in-specific-order2422/1
Pattern: Array Simulation / In-place Logic
Approach: No sorting allowed if you want true O(1) space with O(n) time. Think of it as a variant of partitioning: first push all evens to the front using a two-pointer swap pass (like Dutch National Flag), then reverse the odd segment at the end to flip it from whatever order it landed in to descending. The evens will land in relative order if you're careful with the swap direction - if not, a small in-place insertion-sort pass on just the even segment (which is short) fixes it without extra space.
Time: O(n) | Space: O(1)
*/

class Solution {
    public void sortIt(int[] arr) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            while(left < right && arr[left] % 2 != 0){
                left++;
            }
            while(left < right && arr[right] % 2 == 0){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        int oddEnd = 0;
        while(oddEnd < arr.length && arr[oddEnd] % 2 != 0){
            oddEnd++;
        }
        
        Arrays.sort(arr, 0, oddEnd);
        Arrays.sort(arr, oddEnd, arr.length);
        int i = 0; 
        int j = oddEnd - 1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}

