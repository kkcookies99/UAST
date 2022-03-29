 public List<List<Integer>> XXX(int numRows) {
        int[][] dp = new int[numRows][numRows];
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        dp[0][0] = 1;
        list.add(dp[0][0]);
        res.add(list);
        for (int i = 1; i < dp.length; i++) {
            list = new ArrayList<>();
            dp[i][0] = 1;
            list.add(dp[i][0]);
            for (int j = 0; j+1 < i; j++) {
                dp[i][j+1] = dp[i-1][j]+dp[i-1][j+1];
                list.add(dp[i][j+1]);
            }
            dp[i][i] = 1;
            list.add(dp[1][0]);
            res.add(list);
        }
        return res;
    }

