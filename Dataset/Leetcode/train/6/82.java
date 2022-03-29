 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1) return s;
      StringBuffer sb = new StringBuffer();
	    for(int i=0;i<numRows;i++) {
	    	int a =i,b=0;
	    	//第一行或者最后一行
	    	while(a<s.length()) {
	    		
	    		sb.append(s.charAt(a));
	    		if(i==0 ||i==numRows-1)
	    			a+=2*(Math.max(numRows-i-1, i));
	    		//位于上部分的行，他们的下一位距离较远，位于下部分的行，下一位距离较近
	    		else if(i<numRows/2) {
	    			if(b++%2==0)
	    				a+=2*(Math.max(numRows-i-1, i));
	    			else
	    				a+=2*(Math.min(numRows-i-1, i));
	    		}else {
	    			if(b++%2==0)
	    				a+=2*(Math.min(numRows-i-1, i));
	    			else
	    				a+=2*(Math.max(numRows-i-1, i));
	    		}
	    	}
	    }
		return sb.toString();
    }
}

