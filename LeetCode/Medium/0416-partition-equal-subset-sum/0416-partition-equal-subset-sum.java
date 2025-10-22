class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        // Calculate the total sum of all elements
        for (int num : nums) total += num;

        // If the total sum is odd, we cannot split it into two equal subsets
        if (total % 2 != 0) return false;

        int target = total / 2; // Each subset should sum up to target
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; // Base case: sum 0 is always possible (by taking no elements)

        // For each number in the array
        for (int num : nums) {
            // Iterate backwards to avoid reusing the same number multiple times
            for (int i = target; i >= num; i--) {
                // If sum (i - num) is possible, then sum i is also possible
                dp[i] = dp[i] || dp[i - num];
            }
        }

        // Return whether a subset with sum == target exists
        return dp[target];
    }
}