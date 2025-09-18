class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int maxLen = 0;   // The maximum length of a valid substring found so far
        int cost = 0;     // Current cost of converting s[left..right] to t[left..right]
        int left = 0;     // Left pointer of the sliding window

        // Expand the right pointer step by step
        for (int right = 0; right < s.length(); right++) {
            // Add the cost of converting current character
            cost += Math.abs(s.charAt(right) - t.charAt(right));

            // If cost exceeds the budget, shrink the window from the left
            while (cost > maxCost) {
                cost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }

            // Update the maximum length of valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}