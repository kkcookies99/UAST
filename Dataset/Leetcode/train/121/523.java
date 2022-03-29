 class Solution {
    public int XXX(int[] prices) {
        int XXX = 0, minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            XXX = Math.max(XXX, price - minPrice);
        }
        return XXX;
    }
}

