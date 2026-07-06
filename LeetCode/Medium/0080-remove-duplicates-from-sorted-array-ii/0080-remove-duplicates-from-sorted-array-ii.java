class Solution {
    public int removeDuplicates(int[] nums) {
        // Arrays with at most two elements are already valid.
        if (nums.length <= 2) {
            return nums.length;
        }

        // k points to the position where the next valid element will be placed.
        int k = 2;

        // Start from the third element.
        for (int i = 2; i < nums.length; i++) {
            // Keep the current element only if it is different
            // from the element two positions before k.
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        // Number of valid elements.
        return k;
    }
}