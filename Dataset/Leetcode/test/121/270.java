 class Solution {
    public int XXX(int[] prices) {
        int res = 0;
        int maxindex = prices.length-1;
        for (int i = prices.length - 2; i >= 0; i--) {
            if (prices[maxindex] < prices[i]){
              maxindex = i;  
            } else if (prices[maxindex] - prices[i] > res){
                res = prices[maxindex] - prices[i];
            }
        }
        return res;
    }
}

