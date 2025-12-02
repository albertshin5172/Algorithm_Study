class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();
        int[] dp = new int[n];

        // 1. Initialize dp with the values from the last row of the triangle
        for(int i=0; i<n; i++){
            dp[i] = triangle.get(n-1).get(i);
        }
        // 2. Update dp array from bottom to top
        // Each dp[j] stores the minimum path sum from triangle[i][j] to the bottom
        for(int i=n-2; i>=0; i--){
            for(int j=0; j<=i; j++){
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
            }
        }

        // 3. dp[0] now contains the minimum path sum from the top to the bottom
        return dp[0];
        /*
        int n = triangle.size();
        int[][] dp = new int[n][n];

        // 1. Initialize the last row of dp with the bottom row of the triangle
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = triangle.get(n - 1).get(i);
        }

        // 2. Fill dp from the second last row up to the top
        // Each dp[i][j] stores the minimum path sum from triangle[i][j] to the bottom
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                int left = triangle.get(i).get(j) + dp[i + 1][j];
                int right = triangle.get(i).get(j) + dp[i + 1][j + 1];
                dp[i][j] = Math.min(left, right);
            }
        }

        // 3. dp[0][0] now contains the minimum path sum from top to bottom
        return dp[0][0];
        */
    }
}