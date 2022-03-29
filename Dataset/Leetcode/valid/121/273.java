 class Solution {
    public int XXX(int[] prices) {
        int peak=prices[prices.length-1];
        int max=0;
        for(int i=prices.length-2;i>=0;i--){
            if(prices[i]<peak)max=Math.max(max,peak-prices[i]);
            else peak=prices[i];
        }
        return max;
    }
}

