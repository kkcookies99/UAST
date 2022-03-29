class Solution {
    public int XXX(int n) {
        int[] dp = new int[n];
        if(1 == n){
            return 1;
        }
        if(2 == n){
            return 2;
        }
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2; i<n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}

