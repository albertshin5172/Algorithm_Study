class NumArray {
    // Stores the prefix sums of the input array nums.
    private int[] prefixSum;

    /**
     * Constructor: Computes the prefix sum array for O(1) range sum queries.
     */
    public NumArray(int[] nums) {
        // prefixSum[0] = 0. prefixSum[i] = sum of nums[0]...nums[i-1].
        prefixSum = new int[nums.length+1];

        for(int i=1; i<prefixSum.length; i++){
            prefixSum[i] = prefixSum[i-1] + nums[i-1];
        }
    }
    
    /**
     * Returns the sum of elements in nums between indices left and right (inclusive).
     * Calculation: prefixSum[right + 1] - prefixSum[left]
     */
    public int sumRange(int left, int right) {
        return prefixSum[right+1] - prefixSum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */