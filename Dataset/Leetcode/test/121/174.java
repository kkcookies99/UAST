 class Solution {
    public int XXX(int[] prices) {
        int res  =0;
        int n=prices.length;
        int a=0;
         int b=prices[0];
        for(int i=1;i<n;i++)
        {
            a=Math.min(b,prices[i]);
            b=a;
            if(prices[i]-a>res)
                res=prices[i]-a;
        }
        return res;
    }
}

