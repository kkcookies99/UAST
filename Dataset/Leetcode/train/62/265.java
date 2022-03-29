     public int XXX(int m, int n) {
        //创建一个数组  用来保存到每个位置的方案数
        int[][] dp = new int[m][n];
        //把能赋值的先赋值  便于后面操作
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        //两层遍历
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

