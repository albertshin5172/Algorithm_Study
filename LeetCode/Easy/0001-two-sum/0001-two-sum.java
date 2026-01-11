class Solution {
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store number and its index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for(int i=0; i<nums.length; i++){
            int result = target - nums[i];
            //check if the complement exists in the map
            if(map.containsKey(result)){
                //if exists, return the pair of indices
                return new int[] { map.get(result), i };
            }
            //Otherwise, add current number and its index to the map
            map.put(nums[i], i);
        }
        
        // Return an empty array instead of null if no valid pair is found.
        return new int[] {};
    }
}