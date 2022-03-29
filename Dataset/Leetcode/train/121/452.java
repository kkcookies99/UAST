 class Solution {
    public int XXX(int[] prices) {
        int begin= prices[0];
        int profit;
        int max= 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i] < begin){
                begin = prices[i];
            }
            profit = prices[i] - begin;
            max = Math.max(profit,max);
        }
        return max;
        
    }
}```

