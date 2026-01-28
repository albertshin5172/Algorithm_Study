/**
 * Design a stack that supports push, pop, top, and retrieving 
 * the minimum element in constant time.
 */
class MinStack {
    // Main stack to store all elements
    private Stack<Integer> stack;
    // Auxiliary stack to store the minimum value at each level
    private Stack<Integer> minStack;

    /** * Initialize your data structure here. 
     */
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    /**
     * Pushes the element val onto the stack.
     */
    public void push(int val) {
        stack.push(val);
        
        // If minStack is empty, the first value is the minimum.
        // Otherwise, push the smaller of the new value and the current minimum.
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int currentMin = minStack.peek();
            minStack.push(Math.min(val, currentMin));
        }
    }

    /**
     * Removes the element on the top of the stack.
     */
    public void pop() {
        // Pop from both stacks to keep them synchronized
        stack.pop();
        minStack.pop();
    }

    /**
     * Gets the top element of the stack.
     */
    public int top() {
        return stack.peek();
    }

    /**
     * Retrieves the minimum element in the stack.
     */
    public int getMin() {
        // The top of minStack always represents the minimum of the main stack
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */