class Solution {
    public int firstUniqChar(String s) {
        // Array to store the count of each character ('a' to 'z')
        int[] count = new int[26];

        // First pass: Count the occurrence of each character in the string
        for (int i = 0; i < s.length(); i++) {
            // Increase the count for the corresponding character
            count[s.charAt(i) - 'a']++;
        }

        // Second pass: Find the first character with a count of 1
        for (int i = 0; i < s.length(); i++) {
            // Check if the character occurs only once
            if (count[s.charAt(i) - 'a'] == 1)
                return i; // Return its index
        }

        // If no unique character is found, return -1
        return -1;
    }
}