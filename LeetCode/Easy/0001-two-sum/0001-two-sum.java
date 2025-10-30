class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Compare the current element with all elements after it
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the two elements add up to the target
                if (nums[j] == target - nums[i]) {
                    // Return the indices of the two elements
                    return new int[] { i, j };
                }
            }
        }
        // If no pair is found, return an empty array instead of null
        return new int[] {};
        */
        
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