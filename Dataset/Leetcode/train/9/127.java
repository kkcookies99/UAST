class Solution {
    public boolean XXX(int x) {
       Integer num = x;
	    String str  = numed.toString();
	    int n = str.length();
	    char[] cha  = str.toCharArray();
	    int i = 0;
	    while(i<n){
	      for(int j = n-1;j>=0;j--){
	    	  if(cha[i]!=cha[j]){
	    		  return false;
	    	  }else{
	    		  i++;
	    	  }
	      }
	    }
		return true;
    }
}

