class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the input array to make two-pointer approach possible
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the array, fixing one element at a time
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate elements for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;               // Pointer to the next element
            int right = nums.length - 1;    // Pointer to the last element

            // Use two pointers to find pairs that sum with nums[i] to zero
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Found a triplet that sums to zero
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates for the second and third numbers
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    // Move left pointer right to increase the sum
                    left++;
                } else {
                    // Move right pointer left to decrease the sum
                    right--;
                }
            }
        }
        return result;
    }
}
