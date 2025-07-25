class Solution {
    public int lengthOfLastWord(String s) {
        s = s.stripTrailing();
      
         return s.substring(s.lastIndexOf(" ") + 1).length();
    }
}