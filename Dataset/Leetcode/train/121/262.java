 class Solution {
    public int XXX(int[] prices) {
        int imin=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            max=Math.max(max,prices[i]-imin);
            imin=Math.min(imin,prices[i]);
        }
        return max;
    }
}

