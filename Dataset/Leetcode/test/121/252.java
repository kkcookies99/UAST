 class Solution {
    public int XXX(int[] prices) {
    	int i=0,max=0;
    	for(int j=1;j<prices.length;j++) {
    		if(prices[j]<prices[i]) {
    			i=j;
    		}
    		if(prices[j]-prices[i]>max) {
    			max=prices[j]-prices[i];
    		}
    	}
    	return max;
    }
}

