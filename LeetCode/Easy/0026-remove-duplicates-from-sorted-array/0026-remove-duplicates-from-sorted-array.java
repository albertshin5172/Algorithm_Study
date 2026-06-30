class Solution {
    public int removeDuplicates(int[] nums) {
        // write pointer for last unique element
        int right = 0;

        // read pointer starts from index 1
        for (int left = 1; left < nums.length; left++) {

            // if new unique element found
            if (nums[left] != nums[right]) {
                right++;
                nums[right] = nums[left];
            }
        }

        return right + 1;
    }
}