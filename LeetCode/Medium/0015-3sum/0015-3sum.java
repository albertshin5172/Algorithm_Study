class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array to make it easier to avoid duplicates and use two-pointer approach
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // Fix one number and find the other two using two pointers
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;              // Start pointer after the fixed number
            int right = nums.length - 1;   // End pointer at the last element

            // Use two pointers to find pairs that sum up with nums[i] to zero
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // A valid triplet found, add it to the result
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicate values for the second element
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    // Skip duplicate values for the third element
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    // Increase the sum by moving left pointer to the right
                    left++;
                } else {
                    // Decrease the sum by moving right pointer to the left
                    right--;
                }
            }
        }

        // Return the list of all unique triplets
        return result;
    }
}