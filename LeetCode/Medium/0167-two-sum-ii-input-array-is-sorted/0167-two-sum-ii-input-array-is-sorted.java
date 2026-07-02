class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Two pointers starting from both ends.
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            // Calculate the sum of the two current values.
            int sum = numbers[left] + numbers[right];

            // Target found.
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            }

            if (sum < target) { // Increase the sum by moving the left pointer.
                left++;
            }else {  // Decrease the sum by moving the right pointer.
                right--;
            }
        }

        // This line is never reached because
        // the problem guarantees exactly one solution.
        return new int[] {};
    }
}