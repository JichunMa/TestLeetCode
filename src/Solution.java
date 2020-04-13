
public class Solution {

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices.length < 1) {
            return 0;
        }
        int max = 0;
        int preMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < preMin) {
                preMin = prices[i];
            } else {
                int interest = prices[i] - preMin;
                max = Math.max(interest, max);
            }
        }
        return max;
    }

}
