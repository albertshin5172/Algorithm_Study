class Solution {
    public boolean validPalindrome(String s) {
        // Two pointers starting from both ends.
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // If a mismatch is found,
            // try skipping either the left or the right character.
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }

            // Move both pointers inward.
            left++;
            right--;
        }

        // The string is already a palindrome.
        return true;
    }

    // Check whether the substring is a palindrome.
    public boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            // If any mismatch is found,
            // the substring is not a palindrome.
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}