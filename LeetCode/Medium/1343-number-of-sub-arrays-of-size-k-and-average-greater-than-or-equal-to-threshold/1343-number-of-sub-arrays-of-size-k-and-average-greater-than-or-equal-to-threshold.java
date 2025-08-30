class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int windowSum = 0;
        int result = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        if(windowSum >= k * threshold) result++;

        for(int i = k; i < arr.length; i++){
            windowSum += arr[i] - arr[i-k];

            if(windowSum >= k * threshold) result++;
        }

        return result;
    }
}