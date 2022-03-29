 class Solution {
    public int XXX(int[] prices) {
        int maxProf = 0; // 最大收益
        int minPrice = prices[0]; // 最小买入的价格
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<minPrice){
                minPrice = prices[i];
            }else{
                maxProf = Math.max(maxProf,prices[i]-minPrice);
            }
        }
        return maxProf;
    }
}

