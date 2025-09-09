class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;      // current streak of 1s
        int maxCount = 0;   // longest streak found

        for(int n : nums){
            
            if(n == 1){ //increase count, update maxCount
                count++;
                maxCount = Math.max(count, maxCount);
            }else if(n == 0){   //reset count
                count = 0;
            }
        }

        return maxCount;
    }
}