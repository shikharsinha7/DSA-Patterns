/*
Problem: Longest Repeating Character Replacement (LeetCode 424)
Link: https://leetcode.com/problems/longest-repeating-character-replacement/description/
Pattern: Sliding Window
Approach: Sliding window tracking frequency of the most common character inside it. The window is valid as long as (window length - count of most frequent char) is <= k, shrink when it's not.
Time: O(n) | Space: O(1) (26 letters max)
*/

class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch , 0) + 1);

            int maxf = -1;
            for(Map.Entry<Character,Integer> e : map.entrySet()){
                maxf = Math.max(maxf , e.getValue());
            }   
            while(right - left + 1 - maxf > k){
                char leftChar = s.charAt(left);
                map.put(leftChar , map.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}
