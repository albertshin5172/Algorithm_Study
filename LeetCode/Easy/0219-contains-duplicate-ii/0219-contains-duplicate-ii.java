class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Use a HashSet to represent the sliding window of size k
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // If the current number already exists in the window,
            // then we have found a duplicate within distance k
            if (window.contains(nums[i])) return true;

            // Add the current number to the window
            window.add(nums[i]);

            // Maintain the window size: remove the element that is out of range (i - k)
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        // If no duplicates found within distance k, return false
        return false;
    }
}
