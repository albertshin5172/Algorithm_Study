class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;      // number of rows
        int n = grid[0].length;   // number of columns

        // Step 1: Initialize the first column
        // Only one way to move down in the first column
        for(int i=1; i<m; i++){
            grid[i][0] += grid[i-1][0];
        }

        // Step 2: Initialize the first row
        // Only one way to move right in the first row
        for(int j=1; j<m; j++){
            grid[0][j] += grid[0][j-1];
        }

        // Step 3: Fill in the rest of the grid using dynamic programming
        // Each cell's value represents the minimum sum to reach that cell
        // We can only move either right or down, so:
        // grid[i][j] = current cell value + min(top cell, left cell)
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }

        // Step 4: Return the minimum path sum to the bottom-right corner
        return grid[m-1][n-1];
       }
}