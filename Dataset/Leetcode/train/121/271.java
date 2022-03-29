 class Solution {
    public int XXX(int[] prices) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 1;
        int max = 0;
        while(j < prices.length){
            if(prices[i]<=prices[j]){
                list.add(prices[j]-prices[i]);
                ++j;
            }else{
                i = j; 
                ++j;
            }
        }
        if(!list.isEmpty()){
            max = Collections.max(list);
        }else{
            max = 0;
        }
        return max;
    }
}

