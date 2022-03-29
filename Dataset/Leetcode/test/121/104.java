 class Solution {
    public int XXX(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int max = 0;
        for(int price : prices){
            if(price < buy)
                buy = price;
            else
                max = Math.max(max, price - buy);
        }
        return max;
    }
}

