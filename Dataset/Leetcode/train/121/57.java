 class Solution {
    public int XXX(int[] prices) {
        int maxPro = 0, minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxPro = Math.max(maxPro, price - minPrice);
        }
        return maxPro;
    }
}

