class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        dp[0][0] = 0;           // Not holding any stock on day 0
        dp[0][1] = -prices[0];  // Holding a stock bought on day 0

        for (int i = 1; i < n; i++) {
            // Max profit today without holding: either keep not holding or sell today
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);

            // Max profit today while holding: either keep holding or buy today
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }

        // Max profit at the end of the last day when not holding any stock
        return dp[n-1][0];
    }
}
