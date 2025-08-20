class Solution {
    public void reverseString(char[] s) {
        // Only traverse half of the array (since front/back are swapped simultaneously)
        for (int i = 0; i < s.length / 2; i++) {
            // Swap the current position character with the symmetric position character
            char tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}