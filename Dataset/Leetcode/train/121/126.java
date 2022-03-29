 class Solution {
    public int XXX(int[] prices) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int k = 0;
        for(int i = prices.length-1; i >= 0; i--){
            for(int j = 0; j < prices.length; j++){
                if(i >= j){
                    arr.add(prices[i] - prices[j]);
                }else break;               
            }
        }
        if(Collections.max(arr) > 0){
            return Collections.max(arr);
        }else{
            return 0;
        }
    }
}

