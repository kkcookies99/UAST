 class Solution {
    public int XXX(int[] prices) {
        if(prices.length==1) return 0; 
        int[] dp=new int[prices.length];
        dp[1]=prices[1]-prices[0];
        int min=Math.min(prices[0],prices[1]);
         for(int i=2;i<prices.length;i++){
             min=Math.min(min,prices[i]);    
             dp[i]=prices[i]-min;              
         }
         int max=0;
         for(int i=0;i<dp.length;i++){      
            if(max<dp[i])
            max=dp[i];
         }

         return max;   
    }
}

