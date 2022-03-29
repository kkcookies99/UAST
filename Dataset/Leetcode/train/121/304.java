 class Solution {
    public int XXX(int[] prices) {
        //
        if(prices.length<=1){
            return 0;
        }
        int len = prices.length;
        int value = 0;
        for(int i = 0;i<len;i++){
            int curValue = prices[i];
            for(int j=i+1;j<len;j++){
                int temp = prices[j];
                if(temp - curValue>0 && (temp-curValue)>value){
                    value = temp -curValue;
                }
            }
        }
        return value;
        
    }
}

