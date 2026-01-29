class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        // Stack to keep track of elements in nums2 for which we haven't found the next greater element
        Stack<Integer> stack = new Stack<>();

        // Map to store the next greater element for each number in nums2
        Map<Integer, Integer> nextGreater = new HashMap<>();

        // Iterate through nums2
        for (int num : nums2) {
            // While stack is not empty and current number is greater than the number at the top of the stack
            while (!stack.isEmpty() && stack.peek() < num) {
                // Pop the smaller number and map it to the current number (its next greater element)
                nextGreater.put(stack.pop(), num);
            }
            // Push current number onto the stack as a candidate waiting for a next greater element
            stack.push(num);
        }

        // Build the result array for nums1 based on the nextGreater map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            // If a next greater element exists in the map, use it; otherwise, -1
            result[i] = nextGreater.getOrDefault(nums1[i], -1);
        }

        return result;
    }
}
