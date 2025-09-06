class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if (m > n) return false;
        
        int[] need  = new int[26];
        int[] window  = new int[26];

        // build need and initial window
        for(int i=0; i<m; i++){
            need[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }

        if (Arrays.equals(need, window)) return true;

        // slide window over s2
        for (int i = m; i < s2.length(); i++) {
            // add s2[i], remove s2[i-m]
            window[s2.charAt(i) - 'a']++;
            window[s2.charAt(i - m) - 'a']--;

            if (Arrays.equals(need, window)) return true;
        }

        return false;
    }
}