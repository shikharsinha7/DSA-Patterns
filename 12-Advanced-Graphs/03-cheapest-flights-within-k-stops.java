/*
Problem: Cheapest Flights Within K Stops (LeetCode 787)
Pattern: Advanced Graphs (Dijkstra, Topological Sort, DSU)
Approach: A modified Dijkstra or Bellman-Ford that's limited to k+1 edges — relax edges level by level (kind of like BFS) while tracking accumulated cost instead of just hops.
Time: O(k * E) | Space: O(V)
*/

// code goes here once solved
