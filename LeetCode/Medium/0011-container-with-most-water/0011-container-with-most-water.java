class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len-1;
        int maxContainer = 0;

        while(left < right){
            int currContainer = (right - left) * Math.min(height[left], height[right]);
            maxContainer = Math.max(maxContainer, currContainer);

            if(height[left] > height[right]) right--;
            else left++;
        }
        return maxContainer;
    }
}