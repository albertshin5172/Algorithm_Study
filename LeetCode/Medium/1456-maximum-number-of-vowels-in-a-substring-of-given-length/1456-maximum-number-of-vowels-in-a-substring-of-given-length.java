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

        // Use a boolean array for O(1) vowel lookup (faster than String.indexOf or Set)
        boolean[] isVowel = new boolean[128];
        isVowel['a'] = isVowel['e'] = isVowel['i'] = isVowel['o'] = isVowel['u'] = true;

        // Convert string to char array to avoid the overhead of s.charAt() in loops
        char[] chr = s.toCharArray();
        int len = chr.length;
        int cnt = 0;

        // 1. Process the initial window of size k
        for (int i = 0; i < k; i++) {
            if (isVowel[chr[i]]) {
                cnt++;
            }
        }

        int maxCnt = cnt;
        
        // Early exit: if we already found the maximum possible vowels, return immediately
        if (maxCnt == k) return k;

        // 2. Slide the window from index k to the end of the string
        for (int i = k; i < len; i++) {
            // Add the new character entering from the right
            if (isVowel[chr[i]]) cnt++;
            
            // Remove the character exiting from the left
            if (isVowel[chr[i - k]]) cnt--;

            // Update maxCount if the current window has more vowels
            if (cnt > maxCnt) {
                maxCnt = cnt;
                // Optimization: Stop early if maxCount reaches the window size k
                if (maxCnt == k) return k;
            }
        }

        return maxCnt;
    }
}