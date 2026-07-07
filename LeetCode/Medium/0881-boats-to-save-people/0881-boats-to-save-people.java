class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // Sort people by weight.
        Arrays.sort(people);

        // left: lightest person
        // right: heaviest person
        int boat = 0;
        int left = 0;
        int right = people.length - 1;

        // Continue until all people have been assigned to a boat.
        while (left <= right) {
            // If the lightest and heaviest people can share a boat,
            // move the left pointer.
            if (people[left] + people[right] <= limit) {
                left++;
            }

            // The heaviest person always takes the current boat.
            right--;

            // One boat is used.
            boat++;
        }

        return boat;
    }
}