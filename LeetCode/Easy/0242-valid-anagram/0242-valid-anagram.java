class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) return false;

        // Map to store character frequencies: Key = Character, Value = Count
        HashMap<Character, Integer> map = new HashMap<>();

        // Phase 1: Count characters in string 's'
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Phase 2: Decrement counts based on string 't'
        for (char c : t.toCharArray()) {
            // If character 'c' wasn't in 's', it's not an anagram
            if (!map.containsKey(c)) return false;

            map.put(c, map.get(c) - 1);

            // If count drops below zero, 't' has more occurrences of 'c' than 's'
            if (map.get(c) < 0) return false;
        }

        return true;
        /*
        // Basic length check
        if(s.length() != t.length()) return false;

        // Array of size 26 to store counts for each letter (a-z)
        int[] count = new int[26];

        // Phase 1: Increment index based on character position (c - 'a')
        for(char c : s.toCharArray()){
            count[c - 'a']++;
        }

        // Phase 2: Decrement counts for string 't'
        for(char c : t.toCharArray()){
            count[c - 'a']--;
            
            // If any count becomes negative, 't' is not a permutation of 's'
            if(count[c-'a'] < 0 ) return false;
        }
        
        return true;
         */
    }
}