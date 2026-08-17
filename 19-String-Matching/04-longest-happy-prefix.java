/*
Problem: Longest Happy Prefix (LeetCode 1392)
Link: https://leetcode.com/problems/longest-happy-prefix/description/
Pattern: String Matching (KMP / Rabin-Karp)
Approach: This is exactly KMP's failure function — the longest prefix of the string that is also a suffix. The answer is just the last value in that prefix table.
Time: O(n) | Space: O(n)
*/

class Solution {
    public String longestPrefix(String s) {
        int[] LPS = computeLPS(s);
        return s.substring(0, LPS[s.length() - 1]);
    }
    public int[] computeLPS(String s){
        int m = s.length();
        int[] LPS = new int[m];

        int i = 1;
        int len = 0;
        while(i < m){
            if(s.charAt(i) == s.charAt(len)){
                len++;
                LPS[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = LPS[len - 1];
                }else{
                    LPS[i] = 0;
                    i++;
                }
            }
        }
        return LPS;
    }
}
