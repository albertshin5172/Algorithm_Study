/*
Example 1:
Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7.
 */

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int max = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                max = max + (prices[i + 1] - prices[i]);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        MaxProfit sol = new MaxProfit();
        int[] nums = {7,1,5,3,6,4};
        int val = sol.maxProfit(nums);
        System.out.println("Total profit is: " + val);
    }
}
