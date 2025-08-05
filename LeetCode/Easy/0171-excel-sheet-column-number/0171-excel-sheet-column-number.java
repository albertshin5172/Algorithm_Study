class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int value = 0;
        char c= '\0';
        
        for(int i=0; i<columnTitle.length(); i++){
            c = columnTitle.charAt(i); 
            value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
}