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
    }
}