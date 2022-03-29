 class Solution {
    public int XXX(int[] prices) {
        int len=prices.length;
        int[]temp=new int[len-1];
        for(int i=0;i<len-1;i++){
            temp[i]=prices[i+1]-prices[i];
        }
        int max=0;
        int pre=0;
        for(int i=0;i<len-1;i++){
            pre=Math.max(pre+temp[i],temp[i]);
            max=Math.max(max,pre);
        }
        return max;

    }
}

