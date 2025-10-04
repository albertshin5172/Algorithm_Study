class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n]; // dp[i] = minimum cost to reach step i

        // Base cases: cost to stand on step 0 or step 1
        dp[0] = cost[0];
        dp[1] = cost[1];

        // Build up the dp array from step 2 onwards
        for (int i = 2; i < n; i++) {
            // Minimum cost to reach step i is its own cost plus
            // the cheaper cost between reaching step i-1 or i-2
            dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
        }

        // You can finish on either the last step or the step before it,
        // so return the cheaper of these two final positions
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
