 class Solution {
    public int XXX(int[] prices) {
        int n=prices.length;
        if(n==1){
            return 0;
        }
       int max=0;
       int min=prices[0];
       for(int i=0;i<n;i++){
           max=Math.max(max,prices[i]-min);
           min=Math.min(min,prices[i]);
       }
       return max;
    }
}

