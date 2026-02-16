class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value of the element as the key 
        // and its index as the value for O(1) lookups.
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement: the value needed to reach the target.
            int complement = target - nums[i];

            // Check if the complement already exists in our map.
            // If it does, we found the two numbers that add up to the target.
            if (map.containsKey(complement)) {
                // Return the index of the complement and the current index.
                return new int[] { map.get(complement), i };
            }

            // If not found, store the current number and its index in the map 
            // so it can be used as a potential complement for future elements.
            map.put(nums[i], i);
        }

        // Return an empty array if no solution is found (per problem constraints).
        return new int[] {};
    }
}