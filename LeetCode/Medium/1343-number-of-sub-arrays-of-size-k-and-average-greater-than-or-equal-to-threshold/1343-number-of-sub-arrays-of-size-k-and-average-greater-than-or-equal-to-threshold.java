class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = 0;   // Current sum of the sliding window
        int result = 0;      // Count of subarrays that meet the condition

        // 1. Initialize the first window (sum of the first k elements)
        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }
        // Check the first window average
         if (windowSum / k >= threshold) result++;
         
        // 2. Slide the window across the array
        for(int i=k; i<arr.length; i++){
            // Add the new element and remove the element that goes out of the window
            windowSum += arr[i] - arr[i-k];

            // Check if the new window meets the condition
            if((windowSum/k) >= threshold) result++;
        }
        // 3. Return the final result
        return result;
    }
}