 class Solution {
    public int XXX(int[] prices) {
        if(prices.length==0) return 0;
        int minp=prices[0],maxp=0;
        for(int i=1;i<prices.length;i++){
            minp=Math.min(minp,prices[i]);
            maxp=Math.max(maxp,prices[i]-minp);
        }
        return maxp;
    }
}

