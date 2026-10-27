/*
Problem: Time Based Key-Value Store (LeetCode 981)
Link: https://leetcode.com/problems/time-based-key-value-store/description/
Pattern: Binary Search
Approach: Store a list of (timestamp, value) pairs for every key. For get(), binary search that key's timestamp list to find the largest timestamp that's <= the one asked for.
Time: O(log n) per get, O(1) per set | Space: O(n)
*/

class TimeMap {
    private Map<String, List<Pair>> store;
    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.putIfAbsent(key, new ArrayList<>());
        store.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        String res = "";
        List<Pair> values = store.getOrDefault(key, new ArrayList<>());
        int left = 0;
        int right = values.size() - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(values.get(mid).timestamp <= timestamp){
                res = values.get(mid).value;
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }   
        return res;
    }
    private static class Pair{
        String value;
        int timestamp;
        Pair(String value, int timestamp){
            this.value = value;
            this.timestamp = timestamp;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
