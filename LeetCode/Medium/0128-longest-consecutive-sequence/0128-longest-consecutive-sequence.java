class Solution {
    public int longestConsecutive(int[] nums) {
        // Use a HashSet to allow O(1) lookups and handle duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longest = 0;

        for (int n : set) {
            /* * Check if 'n' is the start of a sequence.
            * If the set contains 'n - 1', then 'n' is part of an existing 
            * sequence and we've either already processed it or will process 
            * it starting from its actual beginning.
            */
            if (!set.contains(n - 1)) {
                int length = 1;
                int cur = n;

                // Incrementally check for the next numbers in the sequence
                while (set.contains(cur + 1)) {
                    cur++;
                    length++;
                }

                // Update the global maximum length found so far
                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}