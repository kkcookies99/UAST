 class Solution {
    public int XXX(int[] prices) {
        int min = 0;
        int res = 0;
        for(int i = 0;i < prices.length; i++){
            if(prices[min] > prices[i]){
                min = i;
            }else {
                res = Math.max(res,prices[i] - prices[min]);
            }
        }
        return res;
    }
}

