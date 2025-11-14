class Solution {
    public int characterReplacement(String s, int k) {
        /* Hash */
        HashMap<Character, Integer> count = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            // Get the current character at the 'right' pointer
            char c = s.charAt(right);

            // Update the frequency of the current character in the map
            count.put(c, count.getOrDefault(c, 0) + 1);

            // Keep track of the highest frequency of any single character in the current window
            maxFreq = Math.max(maxFreq, count.get(c));

            // If the number of characters to change exceeds 'k', shrink the window
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar) - 1);
                left++; // move the left bound forward
            }

            // Update the maximum window size found so far
            result = Math.max(result, right - left + 1);
        }

        return result;     

        /* Array */
        /*
        // Initialize an array to count frequency of each uppercase letter (A-Z)
        int[] count = new int[26];

        // Initialize the left pointer of the sliding window
        int left = 0;
        // Initialize variable to keep track of the max frequency of any character in the current window
        int maxFreq = 0;
        // Initialize result to store the length of the longest valid substring found
        int result = 0;

        // Iterate through the string with pointer 'right' expanding the sliding window
        for(int right = 0; right < s.length(); right++) {
            // Convert current character to index 0-25 by subtracting 'A'
            int idx = s.charAt(right) - 'A';
            // Increase frequency count for this character in the window
            count[idx]++;
            
            // Update maxFreq to the highest frequency in current window
            maxFreq = Math.max(maxFreq, count[idx]);
            
            // If the window size minus the count of the most frequent character is larger than k,
            // shrink the window by moving 'left' pointer right and decreasing the left character frequency
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            // Update result if current window size is larger
            result = Math.max(result, right - left + 1);
        }

        // Return the longest valid substring length
        return result;
        */
    }
}