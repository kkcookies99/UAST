 class Solution {
    public int XXX(int[] prices) {
        
        int maxValue = 0;

        if(prices.length < 2 ){
            return maxValue;
        }

        int minPrice = prices[0];

        for(int i = 1; i < prices.length; i++){
            minPrice =  Math.min(minPrice , prices[i] );
            maxValue = Math.max(maxValue , (prices[i] - minPrice) );
        }
  
        return maxValue;
    }
}

