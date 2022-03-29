 class Solution {
    public int XXX(int[] prices) {	
		if(prices.length<=1) return 0;	
		int first=prices[0],last=prices[0],maxSoFar=0;
		for(int price:prices){
			if(price>=last) last=price;
			else{
				maxSoFar=Math.max(maxSoFar,last-first);			
				first=Math.min(price,first);
				last=price;
			}
		}
		return Math.max(maxSoFar,last-first);
    }
}

