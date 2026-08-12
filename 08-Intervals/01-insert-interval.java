/*
Problem: Insert Interval (LeetCode 57)
Link: https://leetcode.com/problems/insert-interval/description/
Pattern: Intervals
Approach: Walk through the intervals — add everything that ends before the new interval starts as-is, merge everything that overlaps with the new interval into one combined interval, then add the rest unchanged.
Time: O(n) | Space: O(n)
*/

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            if(newInterval[1] < intervals[i][0]){
                list.add(newInterval);
                for(int j = i; j < intervals.length; j++){
                    list.add(intervals[j]);
                }
                return list.toArray(new int[list.size()][]);
            }
            else if(newInterval[0] > intervals[i][1]){
                list.add(intervals[i]);
            }else{
                newInterval[0] = Math.min(newInterval[0] , intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1] , intervals[i][1]);
            }
        }
        list.add(newInterval);
        return list.toArray(new int[list.size()][]);
    }
}
