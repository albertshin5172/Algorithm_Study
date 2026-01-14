class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];

        for(int i=0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int tmpSum = nums[i] + nums[left] + nums[right];

                if(Math.abs(target-tmpSum) < Math.abs(target-closestSum)){
                    closestSum = tmpSum;
                }

                if(tmpSum < target){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return closestSum;
    }
}