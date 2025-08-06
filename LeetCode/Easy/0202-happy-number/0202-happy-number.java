class Solution {
    public boolean isHappy(int n) {
        int d = 0;

        // Continue the process until n becomes 1 (happy)
        // or reaches 4, which indicates an unhappy number cycle
        while(n != 1 && n != 4){
            int sum = 0;
            int num = n;
            // Calculate the sum of the squares of the digits of num
            while(num > 0){
                d = num %10;     // Extract the last digit
                num /= 10;       // Remove the last digit
                sum += d*d;       // Add its square to sum
            }
            n = sum;             // Update n with the sum
        }

        // Return true if n is 1 (happy), false otherwise
        return n==1;
    }
}