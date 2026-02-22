class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;                               // Left pointer of the sliding window
        int maxLen = 0;                             // To store the length of longest substring without repeating characters
        Set<Character> window = new HashSet<>();    // Set to track characters currently in the window

        // Loop through each character with right pointer
        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);   // Current character at right pointer

            // If the character already exists in the window,
            // shrink the window from the left until duplicate is removed
            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++; // Move the left pointer forward
            }

            // Add the current character to the window
            window.add(c);

            // Update the result with the maximum window size found so far
            maxLen = Math.max(maxLen, right-left+1);
        }
        
        // Return the length of the longest substring without repeating characters
        return maxLen;
    }
}