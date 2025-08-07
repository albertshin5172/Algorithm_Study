class Solution {
    public int singleNumber(int[] nums) {
        //complexity O(nlogn) and constant extra space O(1).
        /*
        Arrays.sort(nums);
        
        if(nums.length == 1 || nums[0] != nums[1]) return nums[0];
        
        for(int i=1; i<nums.length-1; i++){
            if(nums[i-1] != nums[i] && nums[i] != nums[i+1]) return nums[i];
        }
        
        return nums[nums.length-1];
        */
        
        int result = 0;
        for(int num : nums){
            // XOR properties
            //complexity O(n) and constant extra space O(1).
            result ^= num;
        }
        return result;
    }
}