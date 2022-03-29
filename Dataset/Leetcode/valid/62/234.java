     public int XXX(int m, int n) {
        int[][] memo = new int[m+1][n+1];
        return help(m,n,memo);
    }
    int help(int m ,int n,int[][]memo){
        //base case
        if(m==1 || n ==1) return 1;
        if(memo[m][n]!=0) return memo[m][n];
        memo[m][n] = help(m-1,n,memo) + help(m,n-1,memo);
        return memo[m][n];

    }

