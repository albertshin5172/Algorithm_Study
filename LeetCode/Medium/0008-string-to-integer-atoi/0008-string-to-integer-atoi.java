class Solution {
    public int myAtoi(String s) {
        // 1. Trim leading and trailing spaces
        s = s.trim();
        if(s.isEmpty()) return 0;
        
        int len = s.length();
        int sign = 1;
        int start = 0;
        long result = 0;
        
        
        // 2. Handle the optional sign at the beginning
        if (start < len && (s.charAt(start) == '+' || s.charAt(start) == '-')) {
            sign = (s.charAt(start) == '-') ? -1 : 1;
            start++; // Move index past the sign
        }

        // 3. Use a for loop to process digits from 'start'
        for(int i=start; i<len; i++){
            char c = s.charAt(i);

            // If the current character is not a digit, stop parsing
            if (!Character.isDigit(c)) break;

            // Convert the digit character to number and accumulate
            result = result * 10 + (c - '0');

            // Clamp to integer limits if overflowing
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        
        return (int)(sign * result);
    }
}