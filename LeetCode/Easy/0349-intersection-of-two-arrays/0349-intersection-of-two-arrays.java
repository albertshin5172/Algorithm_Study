class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Sort both input arrays to facilitate comparison
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0; // Pointer for nums1
        int j = 0; // Pointer for nums2

        // Use a set to store the intersection elements to avoid duplicates
        Set<Integer> set = new HashSet<>();

        // While both pointers are within bounds of their respective arrays
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                // If elements are the same, add to the set and move both pointers forward
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                // If element in nums1 is smaller, move pointer i forward to find a match
                i++;
            } else {
                // If element in nums2 is smaller, move pointer j forward to find a match
                j++;
            }
        }

        // Create an array to store the result from the set
        int[] result = new int[set.size()];
        int k = 0;

        // Copy elements from set to the result array
        for (int num : set) {
            result[k++] = num;
        }

        // Return the intersection array (unique elements common to both input arrays)
        return result;
    }
}
