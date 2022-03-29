     public List<List<Integer>> XXX(int numRows) {
        //动态规划
        //
        int[][] dp=new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            for(int j=0;j<=i;j++){
                dp[i][j]=1;
            }
        }
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        List<Integer> row=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(i>1 && j>0 && j<i){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                row.add(dp[i][j]);
            }
            res.add(row);
        }
        return res;
    }

