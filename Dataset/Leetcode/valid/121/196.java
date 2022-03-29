 public int XXX(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int XXX = 0;
        for (int i = 0; i < prices.length; i++) {
            int num = prices[i] - minPrice;
            if (num < 0) {
                minPrice = prices[i];
                continue;
            }

            XXX = Math.max(XXX, num);
        }
        return XXX;
    }

