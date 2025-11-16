class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /*
        int m = s1.length();
        int n = s2.length();
        int matches = 0;

        // If s1 is longer than s2, permutation is impossible
        if (m > n) return false;

        // Arrays to count character frequency for s1 and current window in s2
        int[] need = new int[26];
        int[] window = new int[26];

        // Initialize frequency counts for s1 and the first window of s2
        for (int i = 0; i < m; i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        // Count how many characters currently match in count between need and window
        for (int i = 0; i < 26; i++) {
            if (need[i] == window[i]) matches++;
        }
        // If all characters match, return true immediately
        if (matches == 26) return true;

        // Slide the window over s2
        for (int right = m; right < n; right++) {
            int add = s2.charAt(right) - 'a';        // Character entering the window
            int remove = s2.charAt(right - m) - 'a'; // Character leaving the window

            // Before updating window, adjust matches count if needed
            if (window[add] == need[add]) matches--;
            window[add]++;
            if (window[add] == need[add]) matches++;

            if (window[remove] == need[remove]) matches--;
            window[remove]--;
            if (window[remove] == need[remove]) matches++;

            // If all characters match, permutation exists
            if (matches == 26) return true;
        }

        // No permutation found in s2
        return false;
        */
        
        int m = s1.length();
        int n = s2.length();

        // If s1 is longer than s2, it's impossible for s2 to contain a permutation of s1
        if (m > n) return false;

        // Arrays to count character frequencies for s1 and the sliding window in s2
        int[] need = new int[26];
        int[] window = new int[26];

        // Initialize frequency counts for s1 and the first window of size m in s2
        for (int i = 0; i < m; i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        // Check if the initial window matches s1's frequency exactly
        if (Arrays.equals(need, window)) return true;

        // Slide the window over s2, one character at a time
        for (int i = m; i < n; i++) {
            // Include next character in the window
            window[s2.charAt(i) - 'a']++;
            // Remove the character that moves out of the window
            window[s2.charAt(i - m) - 'a']--;

            // After updating the window counts, check for match
            if (Arrays.equals(need, window)) return true;
        }

        // No permutation of s1 found in s2
        return false;
    }
}