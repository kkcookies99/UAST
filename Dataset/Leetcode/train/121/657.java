 class Solution {
    public int XXX(int[] prices) {
        // 维护一个最小前缀数组
        if(prices.length == 1){
            return 0;
        }
        int[] min = new int[prices.length];
        min[0] = prices[0];
        int diff = Integer.MIN_VALUE;
        for(int i=1; i<prices.length; i++){
            if(min[i-1]>prices[i]){
                min[i] = prices[i];
            }else{
                min[i] = min[i-1];
            }
            diff = Math.max(diff, prices[i] - min[i]);
            //System.out.println(min[i]);
        }
        return diff;
    }
}

