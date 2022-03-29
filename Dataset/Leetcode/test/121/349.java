        public int XXX(int[] prices) {
        int n = prices.length;
        if (n < 2) {
            return 0;
        }
      
        int[][][] T = new int[n][2][2];
        //base case
        T[0][0][0] = 0;
        T[0][0][1] = Integer.MIN_VALUE;
        T[0][1][0] = Integer.MIN_VALUE;
        T[0][1][1] = -prices[0];

        for (int i = 1; i < n; i++) {
            T[i][1][0] = Math.max(T[i - 1][1][0], T[i - 1][1][1] + prices[i]);
            T[i][1][1] = Math.max(T[i - 1][1][1], T[i - 1][0][0] - prices[i]);

        }
        return Math.max(T[n - 1][1][0], 0);
    }

