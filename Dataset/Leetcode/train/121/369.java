 class Solution {
    public int XXX(int[] prices) {
        int min=prices[0],res=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) min=prices[i];
            else{
                if(prices[i]-min>res) res=prices[i]-min; 
            }
        }
        return res;
    }
}

