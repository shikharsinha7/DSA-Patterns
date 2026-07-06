/*
Problem: Top K Frequent Elements (LeetCode 347)
Link: https://leetcode.com/problems/top-k-frequent-elements/description/
Pattern: Arrays and Hashing
Approach: Count frequency of every element with a hashmap, then either use bucket sort (group numbers by frequency) or a heap to pull out the top k without fully sorting everything.
Time: O(n) with bucket sort | Space: O(n)
*/

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) + 1);
        }
        List<Integer>[] Bucket = new ArrayList[nums.length + 1];

        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            int num = e.getKey();
            int freq = e.getValue();

            if(Bucket[freq] == null){
                Bucket[freq] = new ArrayList<>();
            }
            Bucket[freq].add(num);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i = Bucket.length - 1; i >= 0 && idx < k; i--){
            if(Bucket[i] != null){
                for(int num : Bucket[i]){
                    ans[idx++] = num;

                    if(idx == k){
                        return ans;
                    }
                }
            }
        }
        return ans;
    }
}
