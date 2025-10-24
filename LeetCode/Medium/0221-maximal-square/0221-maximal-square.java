class Solution {
    // Function to find the area of the largest square containing only '1's in the given matrix
    public int maximalSquare(char[][] matrix) {
        // If matrix is empty or has no columns, return 0 right away
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a DP array to store the size of largest square ending at (i, j)
        int[][] dp = new int[rows][cols];
        int maxSide = 0;  // Track the maximum side length of square found

        // Iterate through every cell in the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the current cell in matrix is '1'
                if (matrix[i][j] == '1') {
                    // For first row or first column, square size is 1 if cell is '1'
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        // Otherwise, take the minimum of the three neighbors 
                        // (top, left, top-left) and add 1. This ensures a valid square.
                        dp[i][j] = Math.min(
                            Math.min(dp[i-1][j], dp[i][j-1]),
                            dp[i-1][j-1]
                        ) + 1;
                    }
                    // Update maxSide with the largest square side found so far
                    maxSide = Math.max(maxSide, dp[i][j]);
                }
            }
        }

        // Return the area of the largest square found (side length squared)
        return maxSide * maxSide;
    }
}