class Solution {
    // Merges two sorted arrays nums1 and nums2 into nums1 as one sorted array.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Set i to the last element in the initial portion of nums1
        int i = m-1;
        // Set j to the last element in nums2
        int j = n-1;
        // Set k to the last position in nums1 (which has enough space for all elements)
        int k = m+n-1;
        
        // Compare elements from the end of nums1 and nums2, and insert the largest one at the end of nums1
        while(i >= 0 && j >= 0){
            if(nums1[i] < nums2[j]){
                // If current element in nums2 is larger, place it at the current position k in nums1
                nums1[k--] = nums2[j--];
            }else{
                // If current element in nums1 is larger or equal, place it at the current position k in nums1
                nums1[k--] = nums1[i--];
            }
        }

        // If there are remaining elements in nums2, copy them into nums1
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
