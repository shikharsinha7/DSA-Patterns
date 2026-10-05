/*
Problem: Pascal's Triangle Generation (LeetCode 118 / 119)
Link: https://leetcode.com/problems/pascals-triangle/
Pattern: Array Simulation / In-place Logic
Approach: Pure construction logic, no DS trick - each row's value at position j is the sum of the previous row's values at j-1 and j (with edges always being 1). Build row by row, or for a single row (119), build in-place from right to left to avoid overwriting values you still need.
Time: O(n^2) full triangle, O(k) for a single row | Space: O(1) extra for single-row version
*/

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(List.of(1)));

        for (int i = 0; i < numRows - 1; i++) {
            List<Integer> prev = res.get(res.size() - 1);
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(prev);
            temp.add(0);

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < prev.size() + 1; j++) {
                row.add(temp.get(j) + temp.get(j + 1));
            }
            res.add(row);
        }
        return res;
    }
}
