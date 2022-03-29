 class Solution {
    public int XXX(int[] prices) {
        int max = 0;
        int min = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[min] >= prices[i]) {
                min = i;
            }else {
                int price = prices[i] - prices[min];
                if (max < price) {
                    max = price;
                }
            }

        }
        return max;
    }
}

