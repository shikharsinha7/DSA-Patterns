/*
Problem: Reverse Words in a String, In-place (LeetCode 151)
Link: https://leetcode.com/problems/reverse-words-in-a-string/description/
Pattern: String Simulation / In-place Logic
Approach: Trim extra spaces, then reverse the entire character array, then reverse each individual word back to its correct orientation. The double-reversal trick avoids needing a stack or splitting into a word array.
Time: O(n) | Space: O(1) if using a char array in-place, O(n) if strings are immutable in your language
*/

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while(i >= 0){
            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }

            if(i < 0) break;

            int j = i;
            while(i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            sb.append(s.substring(i + 1 , j + 1));

            while(i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            if(i >= 0){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
