class Solution {
    public int maxVowels(String s, int k) {
        String vowels = "aeiou";
        int count = 0, maxCount = 0;

        // 1. Initial window (the first k characters)
        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) count++;
        }
        maxCount = count;

        // 2. Sliding window
        for (int i = k; i < s.length(); i++) {
            // New character on the right
            if (vowels.indexOf(s.charAt(i)) != -1) count++;
            // Missing character on the left
            if (vowels.indexOf(s.charAt(i - k)) != -1) count--;
            // Update the maximum
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}