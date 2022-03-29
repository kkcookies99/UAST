 public int XXX(int[] prices) {
        int pre=0,max=0;
        int min=prices[0];
        for(int i=0;i<prices.length;i++){
            min=min<prices[i]?min:prices[i];
            pre=Math.max(pre,prices[i]-min);
            max=Math.max(pre,max);
        }
        return max;
    }

