class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;       // Number of rows
        int n = obstacleGrid[0].length;    // Number of columns
        int[][] dp = new int[m][n];        // DP table to store the number of paths

        // If the starting cell has an obstacle, no paths are possible
        if (obstacleGrid[0][0] == 1) return 0;

        // Starting position is reachable
        dp[0][0] = 1;

        // Fill the first column
        for(int i=1; i<m; i++){
            // Current cell is reachable only if there is no obstacle
            // and the cell above it is reachable
            if(obstacleGrid[i][0] == 0 && dp[i-1][0] == 1) dp[i][0] = 1;
        }

        for(int j=1; j<n; j++){
            // Current cell is reachable only if there is no obstacle
            // and the cell to its left is reachable
            if(obstacleGrid[0][j] == 0 && dp[0][j-1] == 1) dp[0][j] = 1;
        }

        // Fill the rest of the grid
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                // If the current cell has no obstacle, sum paths from top and left cells
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }else{
                    // If current cell is an obstacle, no paths can go through it
                    dp[i][j] = 0;
                }
            }
        }

        // The bottom-right cell contains the total number of unique paths
        return dp[m-1][n-1];
    }
}