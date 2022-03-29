     public int XXX(int[] prices) {
        int[] temp = new int[prices.length -1];
        for (int i = 0; i < prices.length - 1; i++) {
            temp[i] = prices[i] - prices[i + 1];
        }
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < temp.length; i++) {
            sum = sum + temp[i];
            if (sum < min) {
                min = sum;
            }
            if (sum > 0) {
                sum = 0;
            }
        }
        return min > 0 ? 0:-min;
    }

