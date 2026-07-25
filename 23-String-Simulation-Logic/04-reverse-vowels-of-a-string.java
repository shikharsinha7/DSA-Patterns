/*
Problem: Reverse Vowels of a String (LeetCode 345)
Link: https://leetcode.com/problems/reverse-vowels-of-a-string/description/
Pattern: String Simulation / In-place Logic
Approach: Two pointers from both ends. Advance the left pointer until it lands on a vowel, advance the right pointer backward until it lands on a vowel, swap them, repeat until pointers cross. Consonants stay exactly where they are.
Time: O(n) | Space: O(1)
*/

class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while(i < j){
            while(i < j && !isVowel(sb.charAt(i))){
                i++;
            }
            while(i < j && !isVowel(sb.charAt(j))){
                j--;
            }
            if(i < j){
                char temp = sb.charAt(i);
                sb.setCharAt(i , sb.charAt(j));
                sb.setCharAt(j , temp);
                i++;
                j--;
            }
        }
        return sb.toString();
    }
    private boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}
