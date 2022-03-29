 class Solution {
    public int XXX(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        //记录结果
        int res = 0;
        //记录最低价格
        int min = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] >= min){
                res = Math.max(res, prices[i] - min);
            }else{
                min = prices[i];
            }
        }

        return res;
    }
}

