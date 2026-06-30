/*
Problem: Permutation in String (LeetCode 567)
Link: https://leetcode.com/problems/permutation-in-string/description/
Pattern: Sliding Window
Approach: Fixed-size sliding window the same length as s1. Slide it across s2, comparing character frequency counts of the window against s1's counts.
Time: O(n) | Space: O(1) (26 letters max)
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int count = map.size();
        int left = 0;
        for(int right = 0; right < s2.length(); right++){
            char ch = s2.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) - 1);

                if(map.get(ch) == 0){
                    count--;
                }
            }
            if(right - left + 1 == s1.length()){
                if(count == 0) return true;

                char leftchar = s2.charAt(left);
                if(map.containsKey(leftchar)){
                    map.put(leftchar, map.get(leftchar) + 1);
                    if(map.get(leftchar) == 1){
                        count++;
                    }
                }
                left++;
            }
        }
        return false;
    }
}
