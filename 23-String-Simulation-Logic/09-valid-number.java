/*
Problem: Valid Number (LeetCode 65)
Link: https://leetcode.com/problems/valid-number/description/
Pattern: String Simulation / In-place Logic
Approach: Pure state-machine parsing, no regex shortcuts. Walk character by character tracking flags for whether you've seen a digit, a dot, an exponent, and a sign, validating the position and count of each as you go (e.g., a dot can't appear after an exponent, a sign can only appear at the very start or right after 'e').
Time: O(n) | Space: O(1)
*/

class Solution {
    public boolean isNumber(String s) {
        s = s.trim();

        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;
        boolean digitAfterExponent = true;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);;

            if(Character.isDigit(c)){
                seenDigit = true;
                digitAfterExponent = true;
            }
            else if(c == '+' || c == '-'){
                if(i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E'){
                    return false;
                }
            }
            else if(c == '.'){
                if(seenDot || seenExponent){
                    return false;
                }
                seenDot = true;
            }
            else if(c == 'e' || c == 'E'){
                if(seenExponent || !seenDigit){
                    return false;
                }
                seenExponent = true;
                digitAfterExponent = false;
            }
            else{
                return false;
            }
        }
        return seenDigit && digitAfterExponent;
    }
}
