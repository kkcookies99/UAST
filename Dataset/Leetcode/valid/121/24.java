 public class MaxProfit {
    public int XXX(int[] prices) {
        int res = 0;
        int buy = 0;
        int sell;
        for (int i = buy + 1; i < prices.length; i++){
            if (prices[i] < prices[buy]) buy = i;
            else {
                sell = i;
                int profit = prices[sell] - prices[buy];
                res = max(res, profit);
            }
        }
        return res;
    }
}

