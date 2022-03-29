 class Solution {
    public int XXX(int[] prices) {
        /*
            法二:dp：
               1.dp[i]:再第i天卖掉的最大利润
               2.状态转化方程:
                    dp[i]=Math.max(dp[i-1]-prices[i-1]+prices[i],prices[i]-prices[i-1]); 
                 析:
                    dp[i]=prices[i]-前i-1天的最小值minprices;
                        minprices有可能在前i-2天 也有可能在i-1天
                    而 dp[i-1]=prices[i-1]-前i-2天的最小值;
                        得 前i-2天的最小值=prices[i-1]-dp[i-1];
                    那么 
                        若前i-1天最小值在前i-2天,则 
                            dp[i]=prices[i]-前i-2天的最小值
                                 =prices[i]-(prices[i-1]-dp[i-1]);
                                 =dp[i-1]-prices[i-1]+prices[i];
                        若在第i-1天,则dp[i]=prices[i]-prices[i-1];
                    所以dp[i]取两则中大的一方
               3.初始值:
                    dp[0]=0;
               进阶:
                观察2可以发现只需要用一个记录量

        */
        int len=prices.length;
        int p=0;
        int maxprofit=0;
        for(int i=1;i<len;i++){
            p=Math.max(p-prices[i-1]+prices[i],prices[i]-prices[i-1]); 
            maxprofit=Math.max(maxprofit,p); 
        }
        return maxprofit;
    }
}

