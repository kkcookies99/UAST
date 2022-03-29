 class Solution {
    public int XXX(int[] prices) {
        int minp=prices[0],ans=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=minp){
                ans=Math.max(ans,prices[i]-minp);
            }else{
                minp=prices[i];
            }
        }
        return ans;
    }
}

