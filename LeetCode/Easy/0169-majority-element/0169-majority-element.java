class Solution {
    public int majorityElement(int[] nums) {
        //Sort the array so that the majority element will be positioned at the center.
        //The key is The majority element is the element that appears more than ⌊n / 2⌋ times. 
        Arrays.sort(nums);
        //Returned the element located in the middle index of the array
        return nums[nums.length/2];
    }
}