class Solution {
    public void reverseString(char[] s) {
        /*
          This is a two-pointer method that accesses both the front and back indices simultaneously. 
		  The back pointer is calculated as length - 1 - i.
        */
        // Only traverse half of the array (since front/back are swapped simultaneously)
        for(int i=0; i<s.length/2; i++){
            // Swap the current position character with the symmetric position character
            char tmo = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = tmp; 
        }
    }
}