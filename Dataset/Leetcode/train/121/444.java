 class Solution {
    public int XXX(int[] prices) {
        int ret=0,max=prices[0],min=prices[0];
        for(int i:prices){
            if(max<i)max=i;
            if(min>i){
                min=i;
                max=i;
            }
            if(max-min>ret)ret=max-min;
        }
        return ret;
    }
}

