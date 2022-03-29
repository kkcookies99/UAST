 class Solution {
    public int XXX(int[] prices) {
        int max = 0;
        int buy = prices[0];
        for(int price : prices) {
            if(price > buy) {
                max = Math.max(max, price - buy);
            }else {
                buy = price;
            }
        }
        return max;
    }
}

