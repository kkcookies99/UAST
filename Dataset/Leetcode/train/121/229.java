 class Solution {
    public int XXX(int[] prices) {
        if(prices.length == 0)return 0;
        for(int i = prices.length -1;i > 0;i--)prices[i] = prices[i] - prices[i-1];
        prices[0] = 0;
        int maxSum = 0;
        int maxSumTemp = 0;
        for(int i = 0;i < prices.length;i++){
            if(maxSumTemp > 0) maxSumTemp += prices[i];
            else maxSumTemp = prices[i];
            if(maxSumTemp > maxSum)maxSum = maxSumTemp;
        }
        return maxSum;
    }
}

