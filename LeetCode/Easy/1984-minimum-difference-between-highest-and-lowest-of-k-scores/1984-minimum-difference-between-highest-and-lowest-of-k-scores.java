class Solution {
    public int minimumDifference(int[] nums, int k) {
        // Sort the input array in ascending order
        Arrays.sort(nums);

        // Initialize minDiff to the maximum possible integer value
        int minDiff = Integer.MAX_VALUE;

        // Iterate through the array to find the minimum difference
        // between the highest and lowest number in every subarray of size k
        for(int i = 0; i + k - 1 < nums.length; i++) {
            // Calculate the difference between the current window's last and first elements
            int diff = nums[i + k - 1] - nums[i];

            // Update minDiff if the current diff is smaller
            minDiff = Math.min(minDiff, diff);
        }

        // Return the minimum difference found
        return minDiff;
    }
}