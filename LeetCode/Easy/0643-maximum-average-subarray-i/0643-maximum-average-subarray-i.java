class Solution {
    public double findMaxAverage(int[] nums, int k) {
      long sum = 0;                   // 안전하게 long 사용
      for (int i = 0; i < k; i++) sum += nums[i];   // 초기 윈도우
      long max = sum;

        for(int i=k; i < nums.length; i++){
            sum += nums[i] - nums[i-k];
             if(sum > max ) max = sum;
        }
        return max/(double)k;
    }
}