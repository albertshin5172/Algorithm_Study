class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];

        // Initialize base case
        dp[0][0] = 0;
        dp[0][1] = -prices[0]; 

        for (int i = 1; i < n; i++) {
            // Either keep not holding or sell the stock today
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1]+prices[i]);
            
            // Either keep holding or buy the stock today
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
        }

        // The maximum profit is when not holding a stock on the last day
        return dp[n-1][0];
    }
}