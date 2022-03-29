 class Solution {
    public int XXX(int[] prices) {
        int min=prices[0],ans=0;
        //min为前i个数里的最小值；ans为前i个数里的最大利润
        for(int i=1;i<prices.length;i++){
            if(ans<prices[i]-min)   ans=prices[i]-min;
            if(min>prices[i])   min=prices[i];
        }
        return ans;
    }
}

