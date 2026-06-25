/*
Problem: Reconstruct Itinerary (LeetCode 332)
Pattern: Advanced Graphs (Dijkstra, Topological Sort, DSU)
Approach: Build an adjacency list sorted alphabetically, then run Hierholzer's algorithm — basically a DFS that uses every edge exactly once — to trace out the Eulerian path.
Time: O(E log E) for sorting edges | Space: O(E)
*/

// code goes here once solved
