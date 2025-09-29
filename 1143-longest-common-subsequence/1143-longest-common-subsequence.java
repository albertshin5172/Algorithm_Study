class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        
        // dp[i][j] represents the length of the longest common subsequence of
        // text1 substring(0, i) and text2 substring(0, j)
        int[][] dp = new int[n + 1][m + 1];

        // Fill in the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // If the characters at current indices (i-1, j-1) match,
                // increment the length of LCS by 1 from the previous matched state
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // If characters don't match, take the maximum LCS length
                    // by either ignoring the current char of text1 or text2
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The bottom-right cell contains the length of LCS for the entire strings
        return dp[n][m];
    }
}