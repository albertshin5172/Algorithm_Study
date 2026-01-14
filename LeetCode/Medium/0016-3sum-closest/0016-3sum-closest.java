class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Sort the array to use the two-pointer approach efficiently
        Arrays.sort(nums);

        // Initialize the closest sum with the sum of the first three numbers
        int closestSum = nums[0] + nums[1] + nums[2];

        // Iterate through the array, fixing one element at a time
        for(int i=0; i<nums.length; i++){
            int left = i+1;
            int right = nums.length-1;

            // Use two pointers to find the best pair for nums[i]
            while(left < right){
                int tmpSum = nums[i] + nums[left] + nums[right];

                // Check if this triplet is closer to the target than the previous best
                if(Math.abs(target-tmpSum) < Math.abs(target-closestSum)){
                    closestSum = tmpSum;
                }

                // Move the pointers based on the comparison with the target
                if(tmpSum < target){
                    left++;  // Increase sum by moving left pointer to the right
                }else{
                    right--; // Decrease sum by moving right pointer to the left
                }
            }
        }
        // Return the closest sum found
        return closestSum;
    }
}