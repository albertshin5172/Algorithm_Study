class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet is used to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through each number in the array
        for (int num : nums) {
            /*
             * HashSet.add(value) returns:
             * - true  : if the value was NOT already in the set (successfully added)
             * - false : if the value already exists in the set
             *
             * If add() returns false, it means a duplicate is found
             */
            if (!set.add(num)) {
                return true; // Duplicate detected
            }
        }

        // No duplicates found
        return false;
    }
}