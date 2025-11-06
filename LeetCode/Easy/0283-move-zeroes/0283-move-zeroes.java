class Solution {
    public void moveZeroes(int[] nums) {
        class Solution {
    public void moveZeroes(int[] nums) {
        //The keypoint is O(n) / in-place / one-pass
        //Position where non-zero elements will be placed
        int idx = 0;
        
        for(int i=0; i<nums.length; i++){
            // Swap non-zero elements forward
            if(nums[i] != 0){
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                idx++;
            }
        }
        
        /*
        int idx = 0;
        int zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[idx++] = nums[i]; 
            }else{
                zero++;
            }
        }
        
        for(int i=0; i<zero; i++){
            nums[nums.length-1-i] = 0;
        }
        */
    }
}
    }
}