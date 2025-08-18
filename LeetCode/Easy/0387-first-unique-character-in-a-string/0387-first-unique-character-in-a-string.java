class Solution {
    public int firstUniqChar(String s) {
        //Time complexity: O(n)
        //Space complexity:O(26) → O(1)
        Map<Character, Integer> map = new HashMap<>();
        
        // Step 1: Count the frequency of each character
        // getOrDefault: if c exists, get its value; otherwise start at 0
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Scan string again to find the first character with frequency == 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        // If no unique character is found, return -1
        return -1;
    }
}