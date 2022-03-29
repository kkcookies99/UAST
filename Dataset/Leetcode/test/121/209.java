 class Solution {
    public int XXX(int[] prices) {
        //暴力超出时间限制
        int len=prices.length;
        int[]dp=new int[len];
        //动态规划
        int max=-prices[0];
        dp[0]=max;
        for(int i=1;i<len;i++){
            dp[i]=Math.max(-prices[i-1]+prices[i],Math.max(-prices[i],dp[i-1]+prices[i]-prices[i-1]));
            max=Math.max(dp[i],max);
        }
        return Math.max(0,max);
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


