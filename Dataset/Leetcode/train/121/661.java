 class Solution {
    public int XXX(int[] prices) {
        int max = 0;
        int buy = 0;
        for(int i =0;i<prices.length-1;i++){
            if(buy>prices[i] || i==0){
                buy = prices[i];
                for(int j=i+1;j<prices.length;j++){
                    int t = prices[j]-buy;
                    max = max>t?max:t;
                }
            }
        }
        return max;
    }
}

