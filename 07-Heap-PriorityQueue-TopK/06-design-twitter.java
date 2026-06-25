/*
Problem: Design Twitter (LeetCode 355)
Pattern: Heap / Priority Queue / Top K
Approach: Hashmap of user -> list of (timestamp, tweetId), plus a heap to merge tweets from everyone you follow by timestamp when building the feed.
Time: O(n log n) for getNewsFeed | Space: O(n)
*/

// code goes here once solved
