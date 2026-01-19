class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;                               // Left pointer of the sliding window
        int maxLen = 0;                             // To store the length of longest substring without repeating characters
        Set<Character> window = new HashSet<>();    // Set to track characters currently in the window

        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);

            while(window.contains(c)){
                window.remove(s.charAt(left));
                left++;
            }

            window.add(c);

            maxLen = Math.max(maxLen, right-left+1);
        }
        
        return maxLen;
    }
}