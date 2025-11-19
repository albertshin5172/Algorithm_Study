class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int left = 0;       // Left pointer of the sliding window
        int cust = 0;       // Base satisfied customers (when grumpy == 0)
        int maxExtra = 0;   // Maximum extra satisfied customers by using the technique
        int extra = 0;      // Current extra satisfied customers in the window

        // Step 1: Count always satisfied customers (when grumpy == 0)
        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0) {
                cust += customers[i];
            }
        }

        // Step 2: Sliding window to find the best "minutes"-length interval
        for (int right = 0; right < grumpy.length; right++) {
            // Add customers if owner was grumpy at this minute
            if (grumpy[right] == 1) {
                extra += customers[right];
            }

            // Shrink the window if its size exceeds "minutes"
            if (right - left + 1 > minutes) {
                if (grumpy[left] == 1) {
                    extra -= customers[left]; // Remove contribution of the leftmost minute
                }
                left++;
            }

            // Update maximum extra customers achievable
            maxExtra = Math.max(maxExtra, extra);
        }

        // Total = always satisfied + best extra satisfied using the technique
        return cust + maxExtra;
    }