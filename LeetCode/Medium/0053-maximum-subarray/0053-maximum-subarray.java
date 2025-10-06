class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int mSum = nums[0];
        int cSum = nums[0];

        for(int i=1; i<n; i++){
            cSum = Math.max(nums[i], cSum + nums[i]);
            mSum = Math.max(cSum, mSum);
        }
        return mSum;
    }
}