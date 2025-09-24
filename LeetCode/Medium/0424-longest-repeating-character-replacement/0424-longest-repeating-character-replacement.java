class Solution {
    public int characterReplacement(String s, int k) {
        /* Hash */
        /*
        HashMap<Character, Integer> count = new HashMap<>();
        int result = 0;
        int left = 0;
        int maxFreq = 0;

        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            count.put(c, count.getOrDefault(c, 0) + 1);

            // update the most frequent character count in window
            maxFreq = Math.max(maxFreq, count.get(c));

            // if replacements needed > k, shrink window
            while((right-left+1) - maxFreq>k){
                char leftChar = s.charAt(left);
                count.put(leftChar, count.get(leftChar)-1);
                left++;
            }

            // update result with valid window length
            result = Math.max(result, right-left+1);
        }
        return result;
        */
        
        /* Array */
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for(int right=0; right<s.length(); right++){
            int idx = s.charAt(right)-'A';
           
            maxFreq = Math.max(maxFreq, ++count[idx]);

            while(right-left+1-maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result, right-left+1);
        }
        return result;
    }
}