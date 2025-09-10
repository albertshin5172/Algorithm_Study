class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Check if the current number already exists in the window
        // If yes, it means a duplicate exists within distance k
        Set<Integer> window = new HashSet<>();

        // Iterate through the array
        for(int i=0; i<nums.length; i++){
            // Check if the current number already exists in the window
            // If yes, it means a duplicate exists within distance k
            if(window.contains(nums[i])){
                return true;
            }

            // Add the current number to the window
            window.add(nums[i]);
            // If the size of the window exceeds k, remove the oldest element
            // This maintains the window size to at most k elements
            if(window.size() > k){
                window.remove(nums[i-k]);
            }
        }
        return false;
    }
}