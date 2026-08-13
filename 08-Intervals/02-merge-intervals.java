/*
Problem: Merge Intervals (LeetCode 56)
Link: https://leetcode.com/problems/merge-intervals/description/
Pattern: Intervals
Approach: Sort all intervals by start time first. Then walk through and merge the current interval into the last one in your result if they overlap, otherwise just add it as a new entry.
Time: O(n log n) | Space: O(n)
*/

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> output = new ArrayList<>();
        output.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] last = output.get(output.size() - 1);
            int[] current = intervals[i];
            if (current[0] <= last[1]) {
                last[1] = Math.max(last[1], current[1]);
            } else {
                output.add(current);
            }
        }
        return output.toArray(new int[output.size()][]);
    }
}
