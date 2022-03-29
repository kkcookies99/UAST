 class Solution {
    public boolean XXX(String s) {

		   s=s.toLowerCase();
		   int L=0;
		   int R=s.length()-1;
		    while(L < R) {
		    	if(!Character.isLetterOrDigit(s.charAt(L))) {
		    		L++;
		    		continue;
		    	}
		    	if(!Character.isLetterOrDigit(s.charAt(R))) {
		    		R--;
		    		continue;
		    	}
		    	if(s.charAt(R)!=s.charAt(L)) {
		    		
		    		return false;
		    	}
		    	L++;
		    	R--;
		    }  
		   return true;
		  	
    }
}

