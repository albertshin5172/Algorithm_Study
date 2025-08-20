class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while(left < right){
            //If the character pointed to by the left pointer is not a number, move one space to the right.
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            //If the character pointed to by the right pointer is not a number, move one space to the left.
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            //// Compare characters without case distinction and return false if they are different
            if(Character.toUpperCase(s.charAt(left)) !=  Character.toUpperCase(s.charAt(right))) return false;

            left++;
            right--;
        }

        return true;
        /*
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        String reversedStr = sb.reverse().toString();
        
        if(s.equals(reversedStr)) return true;
        else return false;
        */
    }
}