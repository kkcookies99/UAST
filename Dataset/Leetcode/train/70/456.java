 public int XXX(int n) {
        // dp[i]表示在i阶式，爬楼梯的方法
        // 在i的时候，可以退1步（i-1），或退2步（i-2）， 表示有两种方法
        // 所有dp[i]等于 dp[i-1] 和 dp[i-2] 的方法数相加即可
        // 得到递推方程
        // dp[i]= dp[i-1] + dp[i-2]

        int dp[]= new int[n+3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n];
    }

