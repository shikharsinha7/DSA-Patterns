/*
Problem: Contiguous Array (LeetCode 525)
Link: https://leetcode.com/problems/contiguous-array/description/
Pattern: Prefix Sum + HashMap
Approach: Treat every 0 as -1 and every 1 as +1, track running sum. Store the first index where each running sum value showed up in a hashmap — if the same sum shows up again, the chunk in between has equal 0s and 1s.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int findMaxLength(int[] nums) {
        int zero = 0;
        int one = 0;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zero++;
            }else{
                one++;
            }
            if(!map.containsKey(one - zero)){
                map.put(one - zero , i);
            }
            if(one == zero){
                res = one + zero;
            }else{
                int idx = map.get(one - zero);
                res = Math.max(res , i - idx);
            }
        }   
        return res;
    }
}
