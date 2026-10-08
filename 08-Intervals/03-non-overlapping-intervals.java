/*
Problem: Non-Overlapping Intervals (LeetCode 435)
Pattern: Intervals
Approach: Sort intervals by end time. Greedily keep an interval if it doesn't overlap with the last one you kept, otherwise count it as one you'd need to remove.
Time: O(n log n) | Space: O(1)
*/

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int res = 0;
        int prevEnd = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] < prevEnd){
                res++;
            }else{
                prevEnd = intervals[i][1];
            }
        }
        return res;
    }
}
