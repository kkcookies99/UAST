 class Solution {
    public int XXX(int[] prices) {
        if(prices.length == 0) {return 0;}
        int[][] memo = new int[prices.length][2];
        memo[0][0] = 0;
        memo[0][1] = 0-prices[0];

        for(int i=1; i < memo.length; i++) {
            memo[i][0] = Math.max(memo[i-1][0], memo[i-1][1]+prices[i]);
            memo[i][1] = Math.max(memo[i-1][1], -prices[i]);
        }
        return memo[prices.length - 1][0];
    }
}

