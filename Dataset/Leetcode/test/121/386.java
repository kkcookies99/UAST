 class Solution {
    public int XXX(int[] prices) {
        int n=prices.length;
        /*
            记录【今天之前买入的最小值】
            计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
            比较【每天的最大获利】，取最大值即可
        */
        int ans=0,min=prices[0];
        for (int i=1;i<n;i++){
            if (min>prices[i]){
                min=prices[i];
            }
            if (ans<prices[i]-min){
                ans=prices[i]-min;
            }
        }
        return ans;
    }
}

