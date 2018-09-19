package number122;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7,6,4,3,1};
        int result = solution.maxProfit(prices);
        System.out.println(result);
    }

    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int profit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int minusValue;
            minusValue = prices[i + 1] - prices[i];
            if (minusValue > 0) {
                profit += minusValue;
            }
        }
        return profit;
    }
}
