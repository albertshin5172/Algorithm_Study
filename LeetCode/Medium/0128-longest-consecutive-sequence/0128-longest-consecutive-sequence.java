class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longest = 0;

        for (int n : set) {
            if (!set.contains(n - 1)) { // 시작점
                int length = 1;
                int cur = n;

                while (set.contains(cur + 1)) {
                    cur++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }
}