class Solution {
    public int XXX(int n) {
        int dp0=1,dp1=2;
        if(n==1)    return 1;
        for(int i=2;i<n;i++){
            int temp=dp1;
            dp1=dp0+dp1;
            dp0=temp;
        }
        return dp1;
    }
}

