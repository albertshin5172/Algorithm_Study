class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Initialize sum to store the sum of the first 'k' elements
        long sum = 0;
        
        for(int i=0; i<k; i++) sum += nums[i];

        // Initialize max with the sum of the first window        
        long max = sum;
        
        // Slide the window from index k to the end of the array
        for(int i=k; i<nums.length; i++){
            // Update sum by subtracting the element leaving the window (nums[i-k])
            // and adding the new element entering the window (nums[i])
            sum += nums[i] - nums[i-k];
             // Update max if the new sum is greater than the previous max
            max = Math.max(max, sum);
        }
        // Return the maximum average by dividing max sum by the window size 'k'
        return max/(double)k;
    }
}