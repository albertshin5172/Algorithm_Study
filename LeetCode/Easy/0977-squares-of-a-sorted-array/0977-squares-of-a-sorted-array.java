class Solution {
    /**
     * Given an integer array 'nums' sorted in non-decreasing order, 
     * return an array of the squares of each number sorted in non-decreasing order.
     */
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Initialize two pointers: one at the beginning and one at the end
        int left = 0;
        int right = n - 1;

        // Fill the result array from back to front (largest to smallest)
        for (int i = n - 1; i >= 0; i--) {
            // Compare the absolute values of the elements at the pointers.
            // The largest square will always come from either the far left (negative) 
            // or the far right (positive) of the sorted array.
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++; // Move the left pointer inward
            } else {
                result[i] = nums[right] * nums[right];
                right--; // Move the right pointer inward
            }
        }
        
        return result;
    }
}