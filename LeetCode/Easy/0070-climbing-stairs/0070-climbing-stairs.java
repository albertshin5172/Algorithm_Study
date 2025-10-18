class Solution {
    public int climbStairs(int n) {
        // Base cases: if there is only 1 or 2 steps, 
        // the number of ways to climb is equal to n itself
        if(n == 1 || n == 2) {
            return n;
        }
       
        // Create an array to store the number of ways to climb each step
        int[] dp = new int[n+1];

        // Initialize the first two steps
        // Only 1 way to climb 1 step
        // Two ways to climb 2 steps (1+1 or 2)
        dp[1] = 1;
        dp[2] = 2;

        // Compute the number of ways for steps 3 to n
        // Each step i can be reached either from step (i-1) or (i-2)
        // So: ways(i) = ways(i-1) + ways(i-2)
        for(int i= 3; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        // Return the number of ways to climb n steps
        return dp[n];
    }
}