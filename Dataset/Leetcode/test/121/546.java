 class Solution {
    public int XXX(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int i : prices) {
            if (min > i) {
                min = i;
            } else if (i - min > max) {
                max = i - min;
            }
        }
        return max;
    }

    public int XXX_1(int[] prices) {
        int max = 0, sum = 0;
        for (int i = 1; i < prices.length; i++) {
            sum += prices[i] - prices[i - 1];
            if (sum < 0) {
                sum = 0;
            } else if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}

