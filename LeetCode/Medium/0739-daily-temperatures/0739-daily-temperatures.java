class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        // The stack stores indices of temperatures, not the temperatures themselves
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            /* * While the stack is not empty and the current temperature is higher 
             * than the temperature at the index stored on top of the stack:
             */
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                // We found a warmer day for the day at 'prev' index
                int prevIndex = stack.pop();
                // Calculate the number of days until the warmer temperature
                result[prevIndex] = i - prevIndex;
            }
            
            // Push the current index onto the stack to find its next warmer day later
            stack.push(i);
        }

        /* * Note: result array is initialized to 0, so days with no 
         * future warmer temperature naturally remain 0.
         */
        return result;
    }
}