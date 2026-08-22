/*
Problem: Subsets (LeetCode 78)
Link: https://leetcode.com/problems/subsets/submissions/2116499139/
Pattern: Backtracking
Approach: Backtracking — at every index, decide to either include or skip the current element, recursing both ways and recording the current combination at every step along the way.
Time: O(n * 2^n) | Space: O(n) recursion depth
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        int limit = (int)Math.pow(2,nums.length);
        for(int i=0; i<limit; i++){
            List<Integer> set = new ArrayList<>();
            int temp = i;
            for(int j=nums.length-1; j>=0; j--){
                int r = temp%2;
                temp = temp/2;
                if(r!=0){
                    set.add(nums[j]);
                }
            }
        list.add(set);
        }
        return list;
    }
}
