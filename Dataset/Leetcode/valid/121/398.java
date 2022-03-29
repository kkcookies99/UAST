 class Solution {
    public int XXX(int[] prices) {
        int ans = 0;
        int left = 0,right = 0;
        while(right < prices.length){
            ans = Math.max(prices[right]-prices[left],ans);
            if(prices[right]<prices[left])
                left = right;
            right++;
        }
        return ans;
    }
}

