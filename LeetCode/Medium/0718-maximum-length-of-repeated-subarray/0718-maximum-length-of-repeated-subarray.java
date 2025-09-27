class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length; 
        int[][] dp = new int[n+1][m+1]; // DP table to store lengths of common suffixes
        int maxLen = 0; // Variable to track the maximum length found
        
        // Iterate through all elements of nums1 and nums2
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If elements at current positions are equal
                if (nums1[i-1] == nums2[j-1]) {
                    // Current dp value is 1 + value from previous indices (suffix length extended by 1)
                    dp[i][j] = dp[i-1][j-1] + 1; 
                    // Update max length if current dp value is larger
                    maxLen = Math.max(maxLen, dp[i][j]); 
                }
            }
        }
        
        return maxLen; // Return the length of the longest common subarray  
    }
}