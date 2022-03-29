 class Solution {
    public int XXX(int[] prices) {
        int min = Integer.MAX_VALUE ;
        int max = 0;
        for(int price : prices){
            if(price < min) min = price;
            if(price - min > max) max = price - min;
        }
        return max;
    }
}

