 class Solution {
    public int XXX(int[] prices) {
        int len = prices.length, max = 0,count = Integer.MAX_VALUE;
        for(int i=0;i<len;i++){
            count = Math.min(count,prices[i]);
            max = Math.max(max,prices[i]-count);
        }
        return max;
    }
}

