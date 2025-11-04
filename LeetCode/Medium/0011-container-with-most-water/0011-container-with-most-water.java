class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;                // Pointer at the start of the array
        int right = len-1;           // Pointer at the end of the array
        int maxContainer = 0;        // Variable to store the maximum 

        // Move pointers towards each other until they meet
        while(left < right){
            // Calculate the current container area with width * min height of two pointers
            int currContainer = (right - left) * Math.min(height[left], height[right]);
            // Update maximum area if the current area is larger
            maxContainer = Math.max(maxContainer, currContainer);

            // Move the pointer pointing to the shorter line inward
            if(height[left] > height[right]) right--;
            else left++;
        }

        // Return the largest area found
        return maxContainer;
    }
}