/*
Problem: Spiral Matrix (LeetCode 54)
Link: https://leetcode.com/problems/spiral-matrix/description/
Pattern: Math and Geometry
Approach: Keep 4 boundaries — top, bottom, left, right — and walk the matrix layer by layer, shrinking the relevant boundary after finishing each direction (right, down, left, up).
Time: O(m*n) | Space: O(1) extra (not counting output)
*/

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> mylist = new ArrayList<>();
        int minr = 0;
        int minc = 0;
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int tne = matrix.length*matrix[0].length;
        int count = 0;
        while(count<tne){
            //top wall
            for(int i=minr , j=minc; j<=maxc && count<tne; j++){
                mylist.add(matrix[i][j]);
                count++;
            }
            minr++;
            //right wall
            for(int i=minr , j=maxc; i<=maxr && count<tne; i++){
                mylist.add(matrix[i][j]);
                count++;
            }
            maxc--;
            //bottom wall
            for(int i=maxr , j=maxc; j>=minc && count<tne; j--){
                mylist.add(matrix[i][j]);
                count++;
            }
            maxr--;
            //left wall
            for(int i=maxr , j=minc; i>=minr && count<tne; i--){
                mylist.add(matrix[i][j]);
                count++;
            }
            minc++;
        }
        return mylist;
    }
}
