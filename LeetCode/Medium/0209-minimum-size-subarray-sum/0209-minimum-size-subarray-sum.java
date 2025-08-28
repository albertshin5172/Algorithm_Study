class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;                       // Start index of the sliding window
        int sum = 0;                        // Current sum of the sliding window
        int minLen = Integer.MAX_VALUE;     // Result: minimum length found

        for(int right=0; right < n; right++){
            sum += nums[right];             // Expand window by moving right pointer

            // Try to shrink the window if the sum is greater than or equal to target
            while(sum >= target){
                minLen = Math.min(minLen, right-left+1);
                sum -= nums[left];          // Remove leftmost element from the window
                left++;                     // Shrink window from the left
            }
        }
        // Return 0 if no such subarray exists that meets the target
        return (Integer.MAX_VALUE == minLen) ? 0 : minLen;
    }
}