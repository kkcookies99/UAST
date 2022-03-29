public int XXX(int n) {
        if(n == 0 || n == 1){
            return 1;
        }
        int[] dp = new int[n + 1];
        int[] steps = new int[]{1, 2};
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            for(int j = 0; j < steps.length; j++){
                dp[i] += dp[i - steps[j]];
            }
        }
        return dp[n];
    }

