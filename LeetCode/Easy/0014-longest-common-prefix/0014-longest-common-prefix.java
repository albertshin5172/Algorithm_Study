class Solution {
    public String longestCommonPrefix(String[] strs) {
        /* Horizontal scanning */
        /*
        String fStr = strs[0];

        for(int i = 0; i<strs.length; i++){
            while(strs[i].indexOf(fStr) != 0){
                fStr = fStr.substring(0, fStr.length()-1);
            }
        }
        return fStr;
        */

        /* Vertical Scanning */
        if(strs == null || strs.length == 0) return "";

        for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);

            for(int j=1; j < strs.length; j++){
                if(i == strs[j].length() || c != strs[j].charAt(i)) return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}