class Solution {
    public boolean isSubsequence(String s, String t) {

        // If s is longer than t, it can never be a subsequence.
        if (s.length() > t.length()) {
            return false;
        }

        // i -> pointer for string s
        // j -> pointer for string t
        int i = 0;
        int j = 0;

        // Scan both strings from left to right.
        while (i < s.length() && j < t.length()) {

            // If characters match,
            // move the pointer of s to look for the next character.
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            // Always move the pointer of t.
            j++;
        }

        // If i reaches the end of s,
        // every character in s appears in order.
        return i == s.length();
    }
}