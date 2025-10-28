class Solution {
    public int coinChange(int[] coins, int amount) {
        // Create a dp array to store the minimum coins needed for each amount
        int[] dp = new int[amount+1];
        // Initialize all values in dp to a large value (amount+1), which means "unreachable" at first
        Arrays.fill(dp, amount+1);
        // Base case: 0 coins needed to make amount 0
        dp[0] = 0;

        // Loop through all amounts from 1 to amount
        for (int i = 1; i <= amount; i++) {
            // For each coin, update dp[i]
            for (int coin : coins) {
                // If the coin can be used
                if (coin <= i) {
                    // Update dp[i] with the minimum coins needed
                    dp[i] = Math.min(dp[i], dp[i-coin] + 1);
                }
            }
        }
        // If dp[amount] wasn't updated (still large), return -1
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
