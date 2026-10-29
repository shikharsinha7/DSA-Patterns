/*
Problem: Median of Two Sorted Arrays (LeetCode 4)
Link: https://leetcode.com/problems/median-of-two-sorted-arrays/description/
Pattern: Binary Search
Approach: Binary search on the smaller array to find the correct partition point, such that everything on the left side (across both arrays) is <= everything on the right side. The median comes from the values right around that partition.
Time: O(log(min(m, n))) | Space: O(1)
*/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;

        if(A.length > B.length){
            int[] temp = A;
            A = B;
            B = temp;
        }
        int total = A.length + B.length;
        int half = total / 2;
        int left = 0;
        int right = A.length - 1;
        while(true){
            int i = Math.floorDiv(left + right, 2);
            int j = half - i - 2;
            int Aleft = (i >= 0) ? A[i] : Integer.MIN_VALUE;
            int Aright = (i + 1 < A.length) ? A[i + 1] : Integer.MAX_VALUE;

            int Bleft = (j >= 0) ? B[j] : Integer.MIN_VALUE;
            int Bright = (j + 1 < B.length) ? B[j + 1] : Integer.MAX_VALUE;

            if(Aleft <= Bright && Bleft <= Aright){
                if(total % 2 == 1){
                    return Math.min(Aright, Bright);
                }
                return ((double) Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
            }else if(Aleft > Bright){
                right = i - 1;
            }else{
                left = i + 1;
            }
        }
    }
}
