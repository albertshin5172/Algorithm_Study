class Solution {
    public String reverseVowels(String s) {

        // Convert the string to a character array for in-place modification.
        char[] word = s.toCharArray();

        // Two pointers starting from both ends.
        int left = 0;
        int right = s.length() - 1;

        // All vowel characters (both lowercase and uppercase).
        String vowels = "aeiouAEIOU";

        while (left < right) {

            // Move the left pointer until a vowel is found.
            while (left < right && vowels.indexOf(word[left]) == -1) {
                left++;
            }

            // Move the right pointer until a vowel is found.
            while (left < right && vowels.indexOf(word[right]) == -1) {
                right--;
            }

            // Swap the two vowels.
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;

            // Move both pointers inward.
            left++;
            right--;
        }

        // Convert the character array back to a string.
        return String.valueOf(word);
    }
}