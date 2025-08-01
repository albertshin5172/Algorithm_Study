class Solution {
    public int maxProfit(int[] prices) {
        //Initialize the maximum profit after selling
        int max = 0;
        //Initialize minimum buying price with the first day's price
        int min = prices[0];
        
        for(int i=1; i<prices.length; i++){
            // Update the minimum buying price
            min = Math.min(min, prices[i]);
            // Update the maximum profit by comparing current max and current price - min buying price
            max = Math.max(max, prices[i]-min);
        }
        
        //return the maximum profit.
        return max;
    }
}