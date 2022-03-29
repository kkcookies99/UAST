class Solution {
    public int XXX(int n) {
        int[] dp= new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<dp.length;i++){
            dp[i]=dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}

