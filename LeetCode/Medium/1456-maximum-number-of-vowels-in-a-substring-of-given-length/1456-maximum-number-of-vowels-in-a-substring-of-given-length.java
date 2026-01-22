class Solution {
    public int maxVowels(String s, int k) {
        /*
        String vowels = "aeiou";
        int cnt = 0, maxCnt = 0;

        // 1. Initial window (the first k characters)
        for(int i=0; i<k; i++){
            if(vowels.indexOf(s.charAt(i)) != -1) cnt++;
        }
        
        maxCnt = cnt;

        // 2. Use a sliding window approach
        for(int i=k; i<s.length(); i++){
            // New character on the right
            if(vowels.indexOf(s.charAt(i)) != -1) cnt++;
             // Missing character on the left
            if(vowels.indexOf(s.charAt(i-k)) != -1) cnt--;
            // Update the maximum
            maxCnt = Math.max(maxCnt, cnt);
        }

        return maxCnt;
        */

        boolean[] isVowel = new boolean[128];
        isVowel['a'] = isVowel['e'] = isVowel['i'] = isVowel['o'] = isVowel['u'] = true;

        char[] chr = s.toCharArray();
        int len = chr.length;
        int cnt = 0;

        for(int i=0; i<k; i++){
            if(isVowel[chr[i]]) cnt++;
        }
        
        int maxCnt = cnt;
        
        for(int i=k; i<len; i++){
            if(isVowel[chr[i]]) cnt++;

            if(isVowel[chr[i-k]]) cnt--;

            if (cnt > maxCnt) {
                maxCnt = cnt;

                if (maxCnt == k) return k;
            }
        }
        
        return maxCnt;
    }
}