 class Solution {
    public int XXX(int[] prices) {

        int value = 0;
        if (prices.length <= 1){
            return value;
        }

        int minIndex = 0;
        for (int i = 1; i < prices.length; i++){
            if (prices[i] < prices[minIndex]){
                minIndex = i;
            }
            value = Math.max(value, prices[i] - prices[minIndex]);
        }
        return value;
    }
}

