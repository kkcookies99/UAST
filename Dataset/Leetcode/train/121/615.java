 class Solution {
    public int XXX(int[] prices) {
    /*    int count=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]-prices[i]>0){
                    count=Math.max(count,prices[j]-prices[i]);
                }
            }
        }
        return count;
        o（n^2) 时间复杂度太大，运行时间超出了时间限制
    */
// 考虑动态规划
        int len=prices.length;
        int []dp=new int[len];
        for(int i=0;i<len;i++){
            dp[i]=0;
        }
        int count=dp[0];
        for(int i=1;i<len;i++){
                dp[i]=Math.max(dp[i],dp[i-1]+prices[i]-prices[i-1]);
                count=Math.max(count,dp[i]);
        }
        return count;

    }
}

