class Solution {
    public void moveZeroes(int[] nums) {
        //The keypoint is O(n) / in-place / one-pass
        //Position where non-zero elements will be placed
        int idx = 0;

        for(int i=0; i<nums.length; i++){
            // Swap non-zero elements forward
            if(nums[i] != 0){
                int tmp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = tmp;
                idx++;
            }
        }
    }
}