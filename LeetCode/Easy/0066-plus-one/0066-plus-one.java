class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, simply add 1 and return.
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            //If the current digit is 9, set it to 0 and continue the loop.  
            digits[i] = 0;
        }
        // If all digits were 9, create an extra space in a new array.
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // Put 1 in the first element, the rest should be 0
        return newDigits;
    }
}