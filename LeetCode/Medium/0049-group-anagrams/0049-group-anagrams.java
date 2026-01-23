class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Check for edge cases
        if (strs == null || strs.length == 0) return new ArrayList<>();

        // 2. Use a HashMap where:
        //    Key = The character frequency "signature" (e.g., "a1b2c0...")
        //    Value = A list of strings that match this signature
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            // 3. Create a frequency array for characters 'a' through 'z'
            char[] count = new char[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            // 4. Convert the array to a String to use as a unique Map Key.
            //    Even though it's a char array, it acts as a unique identifier for the anagram group.
            String key = String.valueOf(count);

            // 5. If the key is not present, initialize a new ArrayList.
            //    Then add the current string to the corresponding list.
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        // 6. Return all the grouped lists as a List<List<String>>
        //    map.values() returns a collection of all the ArrayLists we created.
        return new ArrayList<>(map.values());
    }
}