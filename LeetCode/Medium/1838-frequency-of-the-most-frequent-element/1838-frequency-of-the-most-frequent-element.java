class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);   // Sort the array to apply sliding window logic
        int left = 0;        // Left pointer of the sliding window
        int maxLen = 0;      // Maximum frequency (longest valid window size)
        long sum = 0;        // Sum of elements inside the current window

        // Expand the window with the right pointer
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];  // Add the current element to the window sum

            // Check if we can make all elements in [left..right] equal to nums[right]
            // Condition: (window size * target value) - sum <= k
            while ((long)(right - left + 1) * nums[right] - sum > k) {
                // If cost exceeds k, shrink the window from the left
                sum -= nums[left];
                left++;
            }

            // Update maximum valid window size
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen; // Result: maximum frequency achievable
    }
}