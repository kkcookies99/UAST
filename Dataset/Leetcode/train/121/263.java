 class Solution {
    public int XXX(int[] prices) {
        int left = 0,right = 1;
        int max = 0;
        int length = prices.length;
        while(right<length){
            max = Math.max(prices[right]-prices[left],max);
            if(prices[left]>prices[right]){
                left = right;
                right++;
            }else{
                right++;
            }
        }
        return max;
    }
}

