class Solution {
    public String longestCommonPrefix(String[] strs) {
        String fStr = strs[0];

        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(fStr) != 0){
                fStr=fStr.substring(0,fStr.length()-1);
            }
        }
        return fStr;
    }
}