 class Solution {
    public int XXX(int[] prices) {
        int n = prices.length;
        if(n<2) return 0;
        int sum=0,res=0;
        for(int i=n-1;i>0;i--)
            prices[i] = prices[i]-prices[i-1];
        /*问题转化为求子数组最大连续和*/
        for(int i=1;i<n;i++){
            if(sum>0)
                sum += prices[i];
            else 
                sum = prices[i];
            res = Math.max(res,sum);
        }
        return res;
    }
}

