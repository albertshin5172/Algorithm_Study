class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        int match = 0;

        // Map to store the required character frequencies from string p
        Map<Character, Integer> need = new HashMap<>();
        // Map to store the current sliding window character frequencies
        Map<Character, Integer> window = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        // Build the need map (frequency count of each character in p)
        for(char c : p.toCharArray()){
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        // Expand the window with right pointer
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

            // If the count of c in window matches the required count, increase match
            if(need.containsKey(c) && window.get(c).equals(need.get(c))){
                match++;
            }

            // Shrink the window if its size exceeds the length of p
            while(right - left + 1 > p.length()){
                char d = s.charAt(left++);
                // If the count of d is about to mismatch, decrease match
                if(need.containsKey(d) && window.get(d).equals(need.get(d))){
                    match--;
                }
                window.put(d, window.get(d) - 1);
            }

            // If all characters match, record the starting index
            if(match == need.size()){
                result.add(left);
            }
        }
        return result;
    }
}