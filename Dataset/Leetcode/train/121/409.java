 class Solution {
    public int XXX(int[] prices) {
        /* 
            O(n)
            slow,fast  (在slow买，fast卖)
            slow=0,fast=1;
            maxpf=0
            1.
            if(prices[fast]<prices[slow]){
                slow=fast;
            }
            else{
                maxpf=Math.max(maxpf,prices[fast]-prices[slow]);
            }
            fast++;
            2.循环条件  fast<prices.length;
        */
        int slow,fast;
        slow=0;fast=1;
        int maxpf=0;
        while(fast<prices.length){
            if(prices[fast]<prices[slow]) slow=fast;
            else{
                maxpf=Math.max(maxpf,prices[fast]-prices[slow]);
            }
            fast++;
        }
        return maxpf;
    }
}

