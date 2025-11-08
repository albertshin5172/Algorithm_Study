class Solution {
    // Removes all instances of 'val' from the array 'nums' in-place.
    // Returns the new length of the array after removal.
    public int removeElement(int[] nums, int val) {
        // If the array is empty, return 0
        if(nums.length == 0) return 0;

        int cnt = 0; // Pointer for the position of the next valid element
        // Iterate through the array
        for(int i=0; i<nums.length; i++){
            // If current element is not equal to 'val'
            if(nums[i]!=val){
                // Place the valid element at 'cnt' position
                nums[cnt]=nums[i];
                cnt++; // Move pointer forward
            }
        }
        // Return the count of valid elements (new length)
        return cnt;
    }
}
