package leetcode.easy;

public class BuySellStock {

    public BuySellStock() {
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int tempMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < tempMin) {
                tempMin = prices[i];
            } else {
                maxProfit = Math.max(prices[i] - tempMin, maxProfit);
            }
        }
        return maxProfit;
    }
}