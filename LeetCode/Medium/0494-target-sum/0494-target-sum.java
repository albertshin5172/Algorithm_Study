class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) sum += nums[i]; 

        if(sum<Math.abs(target) || (sum+target)%2 != 0) return 0;
        
        int p = (sum+target)/2;
        
        int[] dp = new int[p+1];
        dp[0] = 1;

        for(int num:nums){
            for(int i=p; i>=num; i--){
                dp[i] += dp[i-num];
            }
        }
        return dp[p];
    }
}