 class Solution {
    public int XXX(int[] prices) {
        int n = prices.length;
        if(n  < 1)return prices[0];
        int min = prices[0];
        int max = 0;
        for(int i = 1; i < n; i++) {
            if(prices[i] < min) {
                min = prices[i];
            }
            if((prices[i] - min) > max) {
                max = prices[i] - min;
            } 
        }
        return max;
    }
}

