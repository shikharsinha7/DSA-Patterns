/*
Problem: Network Delay Time (LeetCode 743)
Pattern: Advanced Graphs (Dijkstra, Topological Sort, DSU)
Approach: Run Dijkstra's algorithm from the source node using a min heap to find shortest time to every other node. The answer is just the max of all those shortest times.
Time: O(E log V) | Space: O(V + E)
*/

// code goes here once solved
