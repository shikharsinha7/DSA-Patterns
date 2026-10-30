/*
Problem: Min Stack (LeetCode 155)
Link: https://leetcode.com/problems/min-stack/description/
Pattern: Monotonic Stack
Approach: Keep two stacks — the normal one, and a second one that always tracks the current minimum value alongside it, so getMin() is O(1) instead of scanning everything.
Time: O(1) per operation | Space: O(n)
*/

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        stack.push(value);
        if(minStack.isEmpty()){
            minStack.push(value);
        }else{
            minStack.push(Math.min(value, minStack.peek()));
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
