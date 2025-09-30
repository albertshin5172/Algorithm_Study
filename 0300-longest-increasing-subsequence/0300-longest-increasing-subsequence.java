class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        // dp[i] will store the length of the longest increasing subsequence ending at index i
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Every element is a subsequence of length 1 by itself
        int max = 1; // Tracks the overall maximum length

        // Compare each element with all previous ones
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // If nums[i] can extend the subsequence ending at nums[j]
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            // Update the global maximum LIS length
            max = Math.max(max, dp[i]);
        }

        // Return the length of the longest increasing subsequence
        // Note: This solution runs in O(n^2). 
        // In the future, we can optimize it using a binary search approach (O(n log n)).
        return max;
    }
}