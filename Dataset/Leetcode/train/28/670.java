 public int XXX(String haystack, String needle) {
        if(needle.length()==0)
	        	return 0;
        if(haystack.length()==0)
        return -1;
        char[] hay=haystack.toCharArray();
	        char[] nee=needle.toCharArray();
	        int n=nee.length-1,l,r;
	        boolean is2=false,flag=true;
	        if(nee.length%2==0)
	        	is2=true;
	        
	        for(int i=0;i<hay.length-n;i++) {
	        	if(hay[i]==nee[0]&&hay[i+n]==nee[n]) {
	        		if(is2) {
	        		l=1;
	        		r=n-1;
	        		}else {
	        			l=1;
	        			r=n;
	        		}
	        		while(l<r) {
	        			if(hay[i+l]!=nee[l]||hay[i+r]!=nee[r]) {
	        				flag=false;
	        				break;
	        			}
	        			l++;
	        			r--;
	        		}
	        		if(flag) 
	        			return i;
                        flag=true;
	        	}
	        }
	    	
	    	
	    	return -1;
    }

