 class Solution {
    public int XXX(int[] prices) {
        int min = prices[0];
        int XXX = 0;
        for(int i=1;i<prices.length;i++){
            XXX = Math.max(XXX, prices[i] - min);
            min = Math.min(prices[i], min);
        }

        return XXX;
    }
}

