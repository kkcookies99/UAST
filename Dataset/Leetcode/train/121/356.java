 class Solution {
    public int XXX(int[] prices) {
        if(prices==null || prices.length<=1) return 0;

        // 动态规划
        int profit = prices[1] - prices[0];
        int ans = profit;
        for(int i=2; i<prices.length; i++) {
            if(profit>=0) profit = prices[i] - (prices[i-1] - profit);
            else profit = prices[i] - prices[i-1];
            ans = Math.max(ans, profit);
        }

        return ans<=0? 0: ans;
    }
}

