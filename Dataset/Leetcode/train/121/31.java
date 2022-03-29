 class Solution {
    public int XXX(int[] prices) {
        int min = prices[0];
        int Max = 0;
        for (int m:prices){
           min = Math.min(min,m);
           if(m > min){
               Max = Math.max(Max,m - min);
           }

        }
        return  Max;
    }
}

