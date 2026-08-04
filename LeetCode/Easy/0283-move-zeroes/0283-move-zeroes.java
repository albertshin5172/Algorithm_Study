class Solution {
    public void moveZeroes(int[] nums) {
        // Pointer for the next position to place a non-zero element
        int idx = 0;
        // Counter to keep track of the number of zeroes encountered
        int zeroCount = 0;

        // First pass: Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                // Place the non-zero element at the current 'idx' and increment it
                nums[idx++] = nums[i]; 
            } else {
                // Count the number of zeroes to be appended later
                zeroCount++;
            }
        }
        
        // Second pass: Fill the remaining positions at the end with zeroes
        // Using 'zeroCount' to determine how many zeroes to fill
        for (int i = 0; i < zeroCount; i++) {
            // Fill from the very last index backwards
            nums[nums.length - 1 - i] = 0;
        }
    }
}