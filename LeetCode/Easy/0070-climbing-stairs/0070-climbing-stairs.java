class Solution {
    public int climbStairs(int n) {
        /*
        if(n ==1 || n==2) return n;

        int [] arr = new int [n];
        arr[0]=1;
        arr[1]=2;

        for(int i=2; i<arr.length; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n-1];
        */
        //DP array memory optimization (using only two variables)
        // Initialize 1st value, 2nd value
        if (n == 1) return 1;
        if (n == 2) return 2;

        int first = 1;  // Ways to climb to step 1 (f(1))
        int second = 2; // Ways to climb to step 2 (f(2))
        int result = 0;

        // Repeat from the 3rd to the nth time
        for (int i = 3; i <= n; i++) {
            result = first + second; // f(n) = f(n-1) + f(n-2)
            first = second;          //Move one space (update the previous value)
            second = result;         //Move one space (update the latest value)
        }
        return result;
    }
}