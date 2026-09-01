/*
Problem: Leaders in an Array (element greater than everything to its right)
Link: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1
Pattern: Array Simulation / In-place Logic
Approach: No stack needed despite looking like a monotonic stack problem. Walk from right to left keeping track of the max seen so far - any element greater than or equal to that running max is a leader. Single backward pass, pure comparison logic.
Time: O(n) | Space: O(1) excluding output
*/

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        list.add(arr[n - 1]);
        int maxTillNow = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            if(arr[i] >= maxTillNow){
                list.add(arr[i]);
            }
            maxTillNow = Math.max(maxTillNow, arr[i]);
        }
        Collections.reverse(list);
        return list;
    }
}

