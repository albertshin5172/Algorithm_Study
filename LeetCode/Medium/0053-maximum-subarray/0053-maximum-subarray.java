class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        // Initialize the maximum subarray sum and the current subarray sum to the first element
        int mSum = nums[0];
        int cSum = nums[0];

        // Traverse the array starting from the second element
        for(int i = 1; i < n; i++) {
            // At each position, choose the larger:
            // either start a new subarray from current element,
            // or extend the previous subarray by including current element
            cSum = Math.max(nums[i], cSum + nums[i]);
            // Update the overall maximum sum if the current sum is larger
            mSum = Math.max(cSum, mSum);
        }
        // Return the maximum subarray sum found
        return mSum;
    }
}