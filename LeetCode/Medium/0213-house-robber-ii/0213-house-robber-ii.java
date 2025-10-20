class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp1 = new int[n];// dp1[i]: Max money robbing from house 0 to i-1 (exclude last house)
        int[] dp2 = new int[n];// dp2[i]: Max money robbing from house 1 to i (exclude first house)

        // Special case: Only one house
        if(n==1) return nums[0];
        // Special case: Only two houses
        if(n==2) return Math.max(nums[0], nums[1]);

        // Initialize: if starting from the 2nd house, max at position 1 is nums[1]
        dp2[1] = nums[1];

        // Fill dp arrays
        for(int i=2; i<n; i++){
            // Exclude last house: rob 0 to n-2
            dp1[i] = Math.max(dp1[i-1], dp1[i-2] + nums[i]);
            // Exclude first house: rob 1 to n-1
            dp2[i] = Math.max(dp2[i-2]+nums[i], dp2[i-1]);
        }
        // Return max between two cases:
        // 1) Rob house 0 and then possible up to n-2
        // 2) Rob from house 1 up to n-1
        return Math.max(nums[0] + dp1[n-2], dp2[n-1]);
    }
}
