     public int XXX(int[] prices) {
        int len = prices.length;
        int minCost = Integer.MAX_VALUE;
        int XXX = 0;
        for (int i = 0; i < len; i++) {
            minCost = Math.min(minCost, prices[i]);
            XXX = Math.max(XXX, prices[i] - minCost);
        }
        return XXX;
    }

