/*
Problem: Group Anagrams (LeetCode 49)
Link: https://leetcode.com/problems/group-anagrams/
Pattern: Arrays and Hashing
Approach: For every string build a key (sorted version of the string works, or a count of each letter), then group all strings with the same key together in a hashmap.
Time: O(n * k log k), k = avg string length | Space: O(n * k)
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int[] arr = new int[26];
            for(char ch : str.toCharArray()){
                arr[ch - 'a']++;
            }
            String key = Arrays.toString(arr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
