class Solution {
    /**
    * Counts the total number of continuous subarrays whose sum equals to k.
    * Time Complexity: O(n) - We traverse the array once.
    * Space Complexity: O(n) - In the worst case, the map stores all prefix sums.
    */
    public int subarraySum(int[] nums, int k) {
        // map stores <PrefixSum, Frequency>
        Map<Integer, Integer> map = new HashMap<>();
        
        // Base case: a prefix sum of 0 has been seen once (empty subarray)
        // This allows us to count subarrays starting from index 0
        map.put(0, 1);

        int sum = 0;   // Cumulative sum (prefix sum)
        int count = 0; // Number of valid subarrays found

        for (int n : nums) {
            // Update the current prefix sum
            sum += n;

            /**
            * Logic: If (currentSum - k) exists in the map, it means there is
            * a previous prefix sum such that: currentSum - previousSum = k.
            * This indicates a subarray ending at the current index sums to k.
            */
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store/update the frequency of the current prefix sum in the map
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}