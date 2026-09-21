/*
Problem: Minimum Interval to Include Each Query (LeetCode 1851)
Link: https://leetcode.com/problems/minimum-interval-to-include-each-query/
Pattern: Intervals
Approach: Sort intervals by start and sort the queries. Use a min heap of (end, size) for intervals that have already started — for each query, pop expired intervals off and the smallest remaining one is your answer.
Time: O((n + q) log n) | Space: O(n)
*/

class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        HashMap<Integer,Integer> res = new HashMap<>();
        int[] sortedQueries = queries.clone();
        Arrays.sort(sortedQueries);
        int i = 0;
        for(int q : sortedQueries){
            while(i < intervals.length && intervals[i][0] <= q){
                int l = intervals[i][0];
                int r = intervals[i][1];
                int length = r - l + 1;
                minHeap.offer(new int[]{length, r});
                i++;
            }
            while(!minHeap.isEmpty() && minHeap.peek()[1] < q){
                minHeap.poll();
            }
            res.put(q, minHeap.isEmpty() ? -1 : minHeap.peek()[0]);
        }
        int[] answer = new int[queries.length];
        for(int j = 0; j < answer.length; j++){
            answer[j] = res.get(queries[j]);
        }
        return answer;
    }
}
