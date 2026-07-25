/*
Problem: String Compression, In-place (LeetCode 443)
Link: https://leetcode.com/problems/string-compression/description/
Pattern: String Simulation / In-place Logic
Approach: Two pointers - a read pointer scanning through groups of repeated characters, and a write pointer placing the character followed by its count (digit by digit if count > 9) directly back into the same array. No extra string building.
Time: O(n) | Space: O(1)
*/

class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;
        
        while(read < chars.length){
            char curr = chars[read];
            int count = 0;

            while(read < chars.length && chars[read] == curr){
                read++;
                count++;
            }

            chars[write++] = curr;

            if(count > 1){
                String str = String.valueOf(count);
                for(char c : str.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}
