/*
Problem: Valid Number (LeetCode 65)
Pattern: String Simulation / In-place Logic
Approach: Pure state-machine parsing, no regex shortcuts. Walk character by character tracking flags for whether you've seen a digit, a dot, an exponent, and a sign, validating the position and count of each as you go (e.g., a dot can't appear after an exponent, a sign can only appear at the very start or right after 'e').
Time: O(n) | Space: O(1)
*/

// code goes here once solved
