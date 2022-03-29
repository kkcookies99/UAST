 class Solution {
    public int XXX(int[] prices) {
        int [] record=new int[prices.length];
        for(int i=prices.length-1;i>0;i--){
          int max=prices[i]-prices[i-1];
            for(int j=i-1;j>=0;j--){
                if(prices[i]-prices[j]>max){
                    max=prices[i]-prices[j];
                }
            }
            record[i]=max;
        }

        int rec=record[0];
        for(int i=1;i<record.length;i++){
            if(record[i]>rec){
                rec=record[i];
            }
        }
        if(rec<0){
            rec=0;
        }
        return rec;
    }
}

