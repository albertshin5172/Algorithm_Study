class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Compare the current element with all elements after it
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two elements add up to the target
                if (nums[j] == target - nums[i]) {
                    // Return the indices of the two elements
                    return new int[] { i, j };
                }
            }
        }
        // If no pair is found, return an empty array instead of null
        return new int[] {};
    }
}