 class Solution {
    public int XXX(int[] prices) {

        int min = prices[0];
        int max = prices[0];

        int maxL = max - min;

        for (int i = 0; i < prices.length; i++)
        {
            max = Math.max(prices[i], max);
            maxL = Math.max(maxL, max - min);

            if (prices[i] < min)
            {
                min = prices[i];
                max = min;
            }
        }

        return maxL;
    }
}

