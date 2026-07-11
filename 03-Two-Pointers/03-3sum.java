/*
Problem: 3Sum (LeetCode 15)
Link: https://leetcode.com/problems/3sum/
Pattern: Two Pointers
Approach: Sort the array first. Fix one number, then use two pointers on the rest to find pairs that sum to the negative of the fixed number. Skip over duplicate values to avoid repeat triplets.
Time: O(n^2) | Space: O(1) extra (not counting output)
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left - 1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;

                } else if(sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
