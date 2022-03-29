 class Solution {
    public int XXX(int[] prices) {
        int[] leftmin=new int[prices.length];
        leftmin[0]=10001;
        for(int i=1;i<prices.length;i++){
            leftmin[i]=Math.min(leftmin[i-1],prices[i-1]);
        }
        int[] rightmax=new int[prices.length];
        rightmax[prices.length-1]=prices[prices.length-1];
        for(int i=prices.length-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],prices[i]);
        }
        int res=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            res=Math.max(rightmax[i]-leftmin[i],res);
            
        }
        return res>0 ? res:0;
    }
}

