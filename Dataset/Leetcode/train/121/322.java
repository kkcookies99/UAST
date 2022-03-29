 class Solution {
    public int XXX(int[] prices) {
        //int[] dp = new int[prices.length];
        int first =0,second = 0;
        int min = prices[0];
        for(int i = 1;i<prices.length;i++) {
            second = Math.max(first,prices[i] - min);
            min = Math.min(prices[i],min);
            first = second;
        }
        return second;
    }
}

