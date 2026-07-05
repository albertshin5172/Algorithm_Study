class Solution {
    public void sortColors(int[] nums) {
        // left: next position for 0
        // mid: current element being examined
        // right: next position for 2
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;

        // Process elements until the mid pointer passes the right pointer.
        while (mid <= right) {

            // Place 0 at the beginning of the array.
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            }else if (nums[mid] == 1) { // 1 is already in the correct middle section.
                mid++;
            }else {  // Place 2 at the end of the array.
                swap(nums, mid, right);
                right--;

                // Do NOT move mid here.
                // The swapped element has not been processed yet.
            }
        }
    }

    // Swap two elements in the array.
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}