 public int XXX(int[] prices) {
        //dd[i]代表第i天卖出时的最大收益
        int[] dd = new int[prices.length];
        int i = 0;
        int max=0;
        dd[i++]=0;
        while(i<prices.length){
            int shouYi = prices[i]-prices[i-1]+dd[i-1];
            if(shouYi>0) dd[i]=shouYi;
            else dd[i]=0; 
            if(dd[i]>max) max=dd[i];
            i++;
        }
        return max;
    }

