class Solution {
    public int combinationSum4(int[] nums, int target) {
        // dp[i] represents the number of combinations that add up to 'i'
        int[] dp = new int[target + 1];

        // Base case: there is one way to make up amount 0 (by using no numbers)
        dp[0] = 1;

        // Compute the number of combinations for each amount from 1 to target
        for (int i = 1; i <= target; i++) {
            // Try each number in the array
            for (int num : nums) {
                // If 'num' can contribute to current sum 'i'
                if (num <= i) {
                    // Add the number of ways to make up the remaining amount (i - num)
                    dp[i] += dp[i - num];
                }
            }
        }

        // dp[target] stores the total number of possible combinations
        return dp[target];
    }
}