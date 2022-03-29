 class Solution {
    public int XXX(int[] prices) {
        if (prices.length == 1) return 0;
        int result = 0;
        int minVal = prices[0];
        for (int i = 1; i < prices.length; i++) {
            minVal = Math.min(minVal , prices[i-1]);
            int nowCount = prices[i] - minVal;
            if (nowCount > result){
                result = nowCount;
            }
        }
        return result;
    }
}

