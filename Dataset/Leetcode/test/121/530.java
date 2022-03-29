     public int XXX(int[] prices) {
        int length = prices.length;
        if(length==1) return 0;
        Map<Integer,Integer> low = new HashMap<Integer,Integer>();
        Map<Integer,Integer> high = new HashMap<Integer,Integer>();
        int minimal = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minimal = Math.min(minimal, prices[i]);
            low.put(i, minimal);
        }
        int maxmium = Integer.MIN_VALUE;
        for(int i= prices.length-1;i>=0;i--){
            maxmium =Math.max(maxmium, prices[i]) ;
            high.put(i, maxmium);
        }
        int finalNum = 0;
        for(int i = 0; i< prices.length;i++){
            finalNum = Math.max(finalNum, high.get(i)- low.get(i));
        }
        return finalNum;
    }

