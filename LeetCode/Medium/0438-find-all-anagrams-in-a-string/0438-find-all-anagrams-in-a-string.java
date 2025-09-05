class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        int match = 0;

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(char c : p.toCharArray()){
            need.put(c, need.getOrDefault(c, 0)+1);
        }

        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0)+1);

            if(need.containsKey(c) && window.get(c).equals(need.get(c))){
                match++;
            }

            while(right - left + 1 > p.length()){
                char d = s.charAt(left++);
                if(need.containsKey(d) && window.get(d).equals(need.get(d))){
                    match--;
                }
                window.put(d, window.get(d)-1);
            }

            if(match == need.size()){
                result.add(left);
            }
        }
        return result;
    }
}