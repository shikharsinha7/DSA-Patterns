/*
Problem: Minimum Window Substring (LeetCode 76)
Link: https://leetcode.com/problems/minimum-window-substring/description/
Pattern: Sliding Window
Approach: Expand the window right until it contains every character needed (tracked with a frequency map), then shrink from the left while it's still valid, keeping track of the smallest valid window seen.
Time: O(n) | Space: O(m), m = length of t
*/

class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : t.toCharArray()){
            map.put(ch, map.getOrDefault(ch , 0) + 1);
        }
        int left = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int count = map.size();
        for(int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch , map.get(ch) - 1);

                if(map.get(ch) == 0){
                    count--;
                }
            }
            while(count == 0){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                if(map.containsKey(leftChar)){
                    map.put(leftChar, map.get(leftChar) + 1);

                    if(map.get(leftChar) > 0){
                        count++;
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
