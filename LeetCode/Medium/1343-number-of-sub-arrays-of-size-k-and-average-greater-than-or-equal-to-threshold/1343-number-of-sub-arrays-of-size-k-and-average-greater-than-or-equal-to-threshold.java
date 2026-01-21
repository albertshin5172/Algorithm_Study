class Solution {
    /**
     * Calculates the number of sub-arrays of size k with an average greater than or equal to threshold.
     * Logic: (Sum of window / k) >= threshold  =>  Sum of window >= (k * threshold)
     */
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // Use long for winSum to prevent potential integer overflow during summation
        long winSum = 0; 
        int result = 0;
        
        // Pre-calculate the required minimum sum to avoid division inside the loop
        // Casting to long prevents overflow if k * threshold exceeds 2^31 - 1
        long targetSum = (long)k * threshold;

        // 1. Initialize the first window (sum of the first k elements)
        for (int i = 0; i < k; i++) {
            winSum += arr[i];
        }

        // Check if the first window meets the condition
        if (winSum >= targetSum) {
            result++;
        }

        // 2. Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            // Sliding Window: Add the incoming element and remove the outgoing element
            winSum += arr[i] - arr[i - k];

            // Compare the current window sum with the target sum
            if (winSum >= targetSum) {
                result++;
            }
        }

        // 3. Return the total count of valid subarrays
        return result;
    }
}