class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        // Array to track whether each position is reachable
        boolean[] reachable = new boolean[n];
        // The first position is always reachable
        reachable[0] = true;

        // Iterate through each position in the array
        for (int i = 0; i < n; i++) {
            // If the current position is not reachable, skip it
            if (!reachable[i]) continue;

            // From the current position, try all possible jump steps
            for (int step = 1; step <= nums[i] && i + step < n; step++) {
                // Mark the next position as reachable
                reachable[i + step] = true;
            }
        }

        // Return true if the last position is reachable
        return reachable[n - 1];
    }
}
