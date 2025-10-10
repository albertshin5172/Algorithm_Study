class Solution {
    public int tribonacci(int n) {
        // If n is 0, return 0 as the base case
        if(n == 0) return 0;
        
        // If n is 1 or 2, return 1 as base cases
        if(n == 1 || n == 2) return 1;
        
        // Create an array dp to store tribonacci values up to n
        int[] dp = new int[n+1];
        
        // Initialize the first three known values of the Tribonacci sequence
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        // Calculate each Tribonacci number from 3 to n
        for(int i=3; i<=n; i++){
            // Current value is the sum of the previous three values
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        // Return the nth Tribonacci number
        return dp[n];
    }
}