 class Solution {
    public int XXX(int[] prices) {
        int ans=0;
        int max=prices[0];
        for(int  i=1;i<prices.length;++i){
            if(max>prices[i]){
                max=prices[i];
            }else{
                ans=Math.max(ans,prices[i]-max);
            }
        }
        return ans;
    }
}

