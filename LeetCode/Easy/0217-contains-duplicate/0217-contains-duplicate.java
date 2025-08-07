class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        Sort the array
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]) return true;
        }
        
        return false;   // If no duplicates found, return false
        */
        //Alternative solution solution using a HashSet to track visited numbers
        Set<Integer> seen = new HashSet<>();
        
         // Iterate through each number in the array
        for (int num : nums) {
            if (!seen.add(num)) return true;    // if already exist, add will be false
        }

        // If no duplicates encountered, return false
        return false;
    }
}