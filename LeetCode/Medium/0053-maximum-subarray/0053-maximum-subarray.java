class Solution {
    public int maxSubArray(int[] nums) {
        int mSum = nums[0];
        int cSum = nums[0];

        for(int i=1; i<nums.length; i++){
            // Either start new from current element or continue previous sum
            cSum = Math.max(nums[i], cSum + nums[i]);
            // Update global max
            mSum = Math.max(cSum, mSum);
        }
        return mSum;
    }
}