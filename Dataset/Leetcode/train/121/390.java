 class Solution {
    public int XXX(int[] prices) {
        int ans=0,min=prices[0];//min当前最小值
        for(int i=1;i<prices.length;i++){
            ans=Math.max(ans,prices[i]-min);
            min=Math.min(min,prices[i]);//更新当前最小值
        }
        return ans;
    }
}

