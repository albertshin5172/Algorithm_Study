class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
             // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) continue; 

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                     // Skip duplicate values for the second element
                    while (left < right && nums[left] == nums[left - 1]) left++;
                     // Skip duplicate values for the third element
                    while (left < right && nums[right] == nums[right + 1]) right--;

                } else if (sum < 0) {
                    // If sum is too small, move left pointer to increase sum
                    left++;
                } else {
                    // If sum is too large, move right pointer to decrease sum
                    right--;
                }
            }
        }
        return res;
    }
}
