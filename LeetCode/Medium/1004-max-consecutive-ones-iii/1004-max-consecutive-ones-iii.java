class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;      // Left pointer of the sliding window
        int maxLen = 0;    // To store the maximum length of subarray
        int zero = 0;      // Count of zeros inside the current window

        // Expand the window using the right pointer
        for(int right=0; right<nums.length; right++){
            // If the current element is 0, increase zero count
            if(nums[right] == 0) zero++;

            // If the number of zeros exceeds k, shrink the window from the left
            while(zero > k){
                if(nums[left] == 0){
                    zero--; // Decrease zero count if we move past a 0
                }
                left++;  //Move left pointer to shrink the window
            }
            // Update the maximum window size found so far
            maxLen = Math.max(maxLen, right-left+1);
        }

         // Return the length of the longest subarray with at most k zeros
        return maxLen;
    }
}