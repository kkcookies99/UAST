 class Solution {
    public int XXX(int[] prices) {
        if (prices.length == 0) return 0;
        int temp = 0;
        int max = 0;
        for(int i=1;i < prices.length;i++) {
            temp = (prices[i] + temp - prices[i-1]) > 0 ? (prices[i] + temp - prices[i-1]) : 0;
            max = max < temp ? temp : max;
        }
        return max;
    }
}

