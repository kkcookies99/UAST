class Solution {
    public int XXX(int n) {
        // 0 1 1 2 3 5 8 13
        // 0 1 2 3 4 5 6 7
        if(n == 0){return 0;}
        if(n == 1){return 1;}
        if(n == 2){return 2;}
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i < n+1;i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}

