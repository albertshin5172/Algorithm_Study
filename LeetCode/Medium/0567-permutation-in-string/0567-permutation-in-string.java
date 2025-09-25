class Solution {
    public boolean checkInclusion(String s1, String s2) {
        /*
        int m = s1.length();
        int n = s2.length();
        if(m>n) return false;

        int[] need = new int[26];
        int[] window = new int[26];

        for(int i=0; i<m; i++){
            need[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(need, window)) return true;

        for(int i=m; i<n; i++){
            window[s2.charAt(i)-'a']++;
            window[s2.charAt(i-m)-'a']--;

            if(Arrays.equals(need, window)) return true;
        }
        return false;
        */
        int m = s1.length();
        int n = s2.length();
        if (m > n) return false;

        int[] need = new int[26];
        int[] window = new int[26];
        for (int i = 0; i < m; i++) {
            need[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) if (need[i] == window[i]) matches++;

        if (matches == 26) return true;

        for (int r = m; r < n; r++) {
            int add = s2.charAt(r) - 'a';
            int remove = s2.charAt(r - m) - 'a';

            // add char r
            if (window[add] == need[add]) matches--; // equality will break
            window[add]++;
            if (window[add] == need[add]) matches++; // equality achieved

            // remove char r-m
            if (window[remove] == need[remove]) matches--; // equality will break
            window[remove]--;
            if (window[remove] == need[remove]) matches++; // equality achieved

            if (matches == 26) return true;
        }
        return false;
    }
}