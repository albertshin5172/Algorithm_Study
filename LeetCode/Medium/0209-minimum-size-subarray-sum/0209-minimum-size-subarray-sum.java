class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0; // Left pointer of the sliding window
        int sum = 0; // Current sum of the window
        int minLen = Integer.MAX_VALUE; // Minimum length of subarray found

        // Expand the window by moving the right pointer
        for(int right = 0; right < nums.length; right++){
            sum += nums[right]; // Add current element to the window sum

            // Shrink the window from the left while the sum meets or exceeds target
            while(sum >= target){
                minLen = Math.min(minLen, right - left + 1); // Update minimum length
                sum -= nums[left]; // Remove leftmost element from the sum
                left++; // Move left pointer to the right
            }
        }

        // If no valid subarray found, return 0; otherwise return minLen
        return (Integer.MAX_VALUE == minLen) ? 0 : minLen;
    }
}