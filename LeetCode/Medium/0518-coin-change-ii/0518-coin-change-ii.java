class Solution {
    public int change(int amount, int[] coins) {
        // dp[i] represents the number of combinations to make up amount i
        int[] dp = new int[amount + 1];
        
        // There is one way to make up amount 0: use no coins
        dp[0] = 1;

        // Iterate through each coin denomination
        for (int coin : coins) {
            // For each amount from 'coin' to 'amount'
            for (int j = coin; j <= amount; j++) {
                // Add the number of combinations using the current coin
                dp[j] += dp[j - coin];
            }
        }

        // dp[amount] contains the total number of combinations
        return dp[amount];
    }
}
