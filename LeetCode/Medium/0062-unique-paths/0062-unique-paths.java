class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D DP array where dp[i][j] represents
        // the number of unique paths to reach cell (i, j)
        int[][] dp = new int[m][n];

        // Initialize the first column: there's only one way
        // to reach any cell in the first column (by moving down)
        for(int i=0; i<m; i++){
            dp[i][0] = 1;
        }

        // Initialize the first row: there's only one way
        // to reach any cell in the first row (by moving right)
        for(int j=0; j<n; j++){
            dp[0][j] = 1;
        }

        // Fill the rest of the DP table
        // Each cell can be reached either from the top or from the left
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        // The bottom-right cell contains the total number of unique paths
        return dp[m-1][n-1];
    }
}