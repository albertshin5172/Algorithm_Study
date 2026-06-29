class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = s.length();
        int right = t.length();

        if(left > right) return false;

        int i = 0;
        int j = 0;

        while(i<left && j<right){
            if(s.charAt(i) == t.charAt(j)) i++;

            j++;
        }
        return i == s.length();
    }
}