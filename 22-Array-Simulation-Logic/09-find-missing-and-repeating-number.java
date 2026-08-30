/*
Problem: Find the Missing and Repeating Number
Link: https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
Pattern: Array Simulation / In-place Logic
Approach: No hashmap allowed for the O(1) space version. Use the array itself as a hashmap: for each value v, go to index (v-1) and negate the value there. If you land on an already-negative value, that index+1 is your repeating number. The one index that never got negated at the end is your missing number.
Time: O(n) | Space: O(1)
*/

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        int repeating = -1;
        int missing = -1;
        for(int i = 0; i < n; i++){
            int value = Math.abs(arr[i]);
            if(arr[value - 1] < 0){
                repeating = value;
            }else{
                arr[value - 1] = -arr[value - 1];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > 0){
                missing = i + 1;
                break;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(repeating);
        list.add(missing);
        return list;
    }
}

