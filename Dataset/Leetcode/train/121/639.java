 class Solution {
    public int XXX(int[] prices) {
        int max=0;
        int min=prices[0];
        int tmp=0;
        for(int i=0;i<prices.length;i++){
            if(min>prices[i]){
                min=prices[i];
            }
            tmp=prices[i]-min;
            if(max<tmp){
                max=tmp;
            }
        }
        return max;
    }
}

