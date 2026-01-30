class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;

        // Initialize result array with -1 (default when no greater element exists)
        int[] results = new int[len];
        Arrays.fill(results, -1);

        // Stack stores indices of elements whose next greater element is not found yet
        Stack<Integer> stack = new Stack<>();

        // Loop twice to simulate circular array behavior
        for (int i = 0; i < len * 2; i++) {

            // While current value is greater than the value at the index on top of the stack
            // resolve the next greater element for that index
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % len]) {
                results[stack.pop()] = nums[i % len];
            }

            // Only push indices from the first pass to avoid duplicates
            if (i < len) {
                stack.push(i);
            }
        }

        return results;
    }
}