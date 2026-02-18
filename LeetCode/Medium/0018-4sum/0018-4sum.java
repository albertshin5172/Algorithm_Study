import java.util.*;

class Solution {
    /**
     * Finds all unique quadruplets in the array that sum up to the target.
     * Strategy: Sorting + Two Pointers (O(n^3))
     */
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Step 1: Sort the array to handle duplicates and use two pointers
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through the first element
        for (int i = 0; i < nums.length - 3; i++) {
            // Skip the same element to avoid duplicate quadruplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // Iterate through the second element
            for (int j = i + 1; j < nums.length - 2; j++) {
                // Skip the same element for the second position
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // Two pointers initialization
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    // Use long to prevent overflow during addition
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        // Found a valid quadruplet
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Move both pointers to find next potential sum
                        left++;
                        right--;

                        // Skip duplicate values for 'left' pointer
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        // Skip duplicate values for 'right' pointer
                        while (left < right && nums[right] == nums[right + 1]) right--;
                        
                    } else if (sum < target) {
                        // Sum is too small, move left pointer to increase sum
                        left++;
                    } else {
                        // Sum is too large, move right pointer to decrease sum
                        right--;
                    }
                }
            }
        }

        return result;
    }
}