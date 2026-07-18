/*
Problem: Game of Life, In-place (LeetCode 289)
Pattern: Simulation / Step-by-Step State Logic
Approach: The naive approach needs a second grid to avoid overwriting cells you still need to check. The O(1) space trick: encode both the old and new state into the same cell using extra bits (e.g., add 2 if the cell is becoming alive, subtract nothing if dying but was alive), then do a final pass to normalize every cell to just 0 or 1.
Time: O(m * n) | Space: O(1) with bit-encoding trick
*/

// code goes here once solved
