     public int XXX(int m, int n) {
        if(n == 1) return m - 1;
        if(m == 1) return n - 1;
        int min = Math.min(m,n) - 1;
        int max = Math.max(m,n) - 1;
        //return dp(m,n);
        return C(min ,max , max + min);
    }
    private int C(int min, int max, int total) {
        System.out.println(min +"\t"+max+"\t"+total);
        long res = 1;
        for(int i = max + 1; i <= total; i++) {
            res*=i;
        }
        for(int i = 1; i <= min; i++) {
            res/=i;
        }
        return (int) res;
    }
    private int dp(int m,int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }

