 class Solution {
    public int XXX(int[] prices) {
        int y=0;
        if(prices.length==1 || prices.length==0)
            return y;
        else{
            int temp=prices[0];
        for(int i =1;i<prices.length;i++){
            if(prices[i]<temp)
                temp=prices[i];
                else{
           if(prices[i]-temp>y)
               y=prices[i]-temp;
        }
    }
        return y;
        }
    }
}

