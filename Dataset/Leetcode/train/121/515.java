 class Solution {
    public int XXX(int[] prices) {
        if(prices.length==0||prices.length==1) return 0;
        int profit=0, minIndex=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]-prices[minIndex]>profit) profit = prices[i]-prices[minIndex];
            if(prices[i]<prices[minIndex]) minIndex=i;
        }

        return profit;
    }
}

