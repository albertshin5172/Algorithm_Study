class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        String reversedStr = sb.reverse().toString();
        
        if(s.equals(reversedStr)) return true;
        else return false;
    }
}