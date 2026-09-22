/*
Problem: Car Pooling (LeetCode 1094)
Link: https://leetcode.com/problems/car-pooling/description/
Pattern: Intervals
Approach: Treat each trip as a range where capacity changes — add passengers at the pickup point, remove them at the drop-off point. Sort these change-points by location and sweep through, tracking running capacity. If it ever exceeds the car's limit, return false.
Time: O(n log n) | Space: O(n)
*/

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, Comparator.comparingInt(t -> t[1]));
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        int curPass = 0;
        for (int[] trip : trips) {
            int numPass = trip[0];
            int start = trip[1];
            int end = trip[2];
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= start) {
                curPass -= minHeap.peek()[1];
                minHeap.poll();
            }
            curPass += numPass;
            if (curPass > capacity) {
                return false;
            }
            minHeap.offer(new int[]{end, numPass});
        }
        return true;
    }
}
