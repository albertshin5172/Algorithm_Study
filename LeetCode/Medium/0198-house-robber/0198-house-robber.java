class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        // If there is only one house, the maximum money is just nums[0]
        if(n==1) return nums[0];

        // dp[i] represents the maximum amount of money that can be robbed from the first i+1 houses
        int[] dp = new int[n];

        // Initialize the first two houses
        dp[0] = nums[0];                        // Only one option: rob house 0
        dp[1] = Math.max(nums[0], nums[1]);     // Rob the house with the larger amount

        
        // Fill dp array for the rest of the houses
        for(int i=2; i<n; i++){
            // Two choices:
            // 1) Skip current house -> dp[i-1]
            // 2) Rob current house -> nums[i] + dp[i-2]
            dp[i] = Math.max(dp[i-1], nums[i]+dp[i-2]);
        }
        
        // The last element contains the maximum amount of money that can be robbed
        return dp[n-1];
    }
}