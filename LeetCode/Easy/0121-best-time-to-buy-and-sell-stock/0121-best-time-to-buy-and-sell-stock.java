class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;   // left pointer represents the day to buy (minimum price so far)
        int right = 1;  // right pointer represents the day to sell
        int max = 0;    // max profit found so far

        // Iterate through the price array
        while (right < prices.length) {
            // If selling price is higher than buying price,
            // calculate profit and update max profit
            if (prices[right] > prices[left]) {
                max = Math.max(max, prices[right] - prices[left]);
            } 
            // If current selling price is lower,
            // move left pointer to current day (new potential buy day)
            else {
                left = right;
            }

            // Move right pointer forward
            right++;
        }

        // Return the maximum profit
        return max;
    }
}
