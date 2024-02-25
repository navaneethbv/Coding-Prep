package MustDo;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println("The maximum product sub array value is "+maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        int minSoFor = Integer.MAX_VALUE;
        int largestDifference = 0;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minSoFor) {
                minSoFor = prices[i];
            } else {
                largestDifference = Math.max(largestDifference, (prices[i] - minSoFor));
            }
        }
        return largestDifference;
    }
}
