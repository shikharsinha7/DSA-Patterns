/*
Problem: Compare Version Numbers (LeetCode 165)
Link: https://leetcode.com/problems/compare-version-numbers/description/
Pattern: String Simulation / In-place Logic
Approach: Walk both version strings simultaneously with two pointers, manually parsing out each dot-separated numeric chunk (skip using split() if you want the true O(1)-extra-space version) and comparing chunk by chunk. Missing trailing chunks are treated as zero.
Time: O(n + m) | Space: O(1) if parsed manually without split()
*/

class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
        int n = version1.length();
        int m = version2.length();

        while (i < n || j < m) {
            int num1 = 0;
            while (i < n && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            int num2 = 0;
            while (j < m && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            if (num1 > num2)
                return 1;
            if (num1 < num2)
                return -1;

            i++;
            j++;
        }

        return 0;
    }
}
