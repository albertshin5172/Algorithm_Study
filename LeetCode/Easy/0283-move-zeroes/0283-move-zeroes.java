class Solution {
    public void moveZeroes(int[] nums) {
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
    }
}