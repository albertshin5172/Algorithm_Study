class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // Array to store the number of days to wait for a warmer temperature
        int[] result = new int[temperatures.length];

        // Stack to store indices of temperatures
        // It maintains a decreasing monotonic stack (temperatures in descending order)
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            // While current temperature is higher than the temperature at the index on top of the stack
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {

                // Get the index of the previous colder day
                int prev = stack.pop();

                // Calculate the number of days waited for a warmer temperature
                result[prev] = i - prev;
            }

            // Push current index onto the stack
            stack.push(i);
        }

        // Remaining indices in the stack do not have a warmer future day (default value is 0)
        return result;
    }
}