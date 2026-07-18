/*
Problem: Rearrange Array in Maximum-Minimum Form (Alternating)
Pattern: Array Simulation / In-place Logic
Approach: Given a sorted array, rearrange so it alternates max, min, second-max, second-min, etc. The O(1) space trick: encode two numbers into one slot using arr[i] = arr[i] + (arr[j] % maxElement) * maxElement, then decode in a second pass by dividing by maxElement. Avoids needing a second array entirely.
Time: O(n) | Space: O(1)
*/

// code goes here once solved
