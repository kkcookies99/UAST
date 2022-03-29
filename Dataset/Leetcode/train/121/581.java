 class Solution {
    public int XXX(int[] prices) {
        if(prices.length==1)return 0;
        int last=0;
        int fast=0;
        int max=0;
        while(fast<prices.length){
            if(prices[fast]>prices[last]){
                max = Math.max(prices[fast]-prices[last],max);
            }else if(prices[last]>=prices[fast]){
                last=fast;
            }
            fast+=1;
        }
        return max;
    }
}

