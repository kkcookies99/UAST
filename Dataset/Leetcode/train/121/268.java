 class Solution {
    public int XXX(int[] prices) {
        int start = prices[0], end = prices[0], max = 0;
        for(int price : prices){
            start = Math.min(start, price);
            end = price;
            max = Math.max(max, end - start);
        }
        return max;
    }
}

