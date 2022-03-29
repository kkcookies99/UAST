 class Solution {
    public int XXX(int[] prices) {
        int result = 0;
        int i = 0;

        for (int j = 0; j < prices.length; j++) {
            if (j > i) {
                if (prices[j] >= prices[i]) {
                    result = result > (prices[j] - prices[i]) ? result : (prices[j] - prices[i]);
                } else {
                    i = j;
                }
            }
        }
        return result;
    }
}

