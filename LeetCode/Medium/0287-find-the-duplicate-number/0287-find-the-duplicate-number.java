class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        // Phase 1: Find the meeting point inside the cycle
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow == fast) {
                break;
            }
        }

        // Phase 2: Find the entrance of the cycle
        int ptr = 0;

        while (ptr != slow) {
            ptr = nums[ptr];
            slow = nums[slow];
        }

        return ptr;
    }
}