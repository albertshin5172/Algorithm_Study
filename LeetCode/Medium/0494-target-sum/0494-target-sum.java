class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        // Calculate the total sum of the array
        for (int i = 0; i < nums.length; i++) sum += nums[i];

        // If target is not achievable or parity condition fails, return 0
        if (sum < Math.abs(target) || (sum + target) % 2 != 0) return 0;

        // Transform the problem into a subset sum problem:
        // Find the number of subsets whose sum equals p = (sum + target) / 2
        int p = (sum + target) / 2;

        // dp[i] = number of ways to get sum i
        int[] dp = new int[p + 1];
        dp[0] = 1; // One way to make sum 0 — use no elements

        // Iterate through each number in nums
        for (int num : nums) {
            // Traverse backwards to avoid reusing the same element
            for (int i = p; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        // The result is the number of ways to make sum p
        return dp[p];
    }
}
