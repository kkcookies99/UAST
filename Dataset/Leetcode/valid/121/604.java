 class Solution {
    public int XXX(int[] prices) {
        if(prices.length==1)return 0;
        int last=0;
        int fast=0;
        int max=0;
        while(fast<prices.length-1){
            fast+=1;
            if(prices[fast]>prices[last]){
                max = Math.max(prices[fast]-prices[last],max);
            }else if(prices[last]>=prices[fast]){
                last=fast;
            }
        }
        return max;
    }
}

