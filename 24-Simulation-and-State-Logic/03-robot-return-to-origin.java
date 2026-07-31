/*
Problem: Robot Return to Origin (LeetCode 657)
Link: https://leetcode.com/problems/robot-return-to-origin/description/
Pattern: Simulation / Step-by-Step State Logic
Approach: Straightforward state tracking - maintain an x and y counter, walk through the move string once incrementing/decrementing based on U/D/L/R, and check if both end at zero. The "trick" is resisting the urge to overcomplicate this with coordinates/vectors when two integers suffice.
Time: O(n) | Space: O(1)
*/

class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'U'){
                y++;
            }else if(ch == 'R'){
                x++;
            }else if(ch == 'L'){
                x--;
            }else{
                y--;
            }
        }
        return x == 0 && y == 0;
    }
}
