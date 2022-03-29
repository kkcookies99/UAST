 class Solution {
    public String XXX(String s) {
		char c[] = s.toCharArray();
    	if(c.length<=1) return s;
    	int index[] = new int[2];
    	String res = "";
    	for(int i = 1;i<c.length;i++){
    		int temp = 0;
    		if(c[i]==c[i-1]){
    			int lindex = i-1,rindex = i,count=0;
    			while((i+temp<c.length)&&(lindex-count>=0&&rindex+count<c.length)){
    				if(c[i] == c[i+temp]){
    					rindex = i+temp;
    					if(rindex-lindex>(index[1]-index[0])){
    						index[0] = lindex;
    	    				index[1] = rindex;
    					}
    					temp++;
    				}else{
    					if(c[lindex - count]==c[rindex + count]){
        					if((rindex-lindex)+2*count>(index[1]-index[0])){
    	    					index[0] = lindex - count;
    		    				index[1] = rindex + count;
    	    				}
    	    			}else{
    	    				break;
    	    			}
    					count++;
    				}
        		}
			}else{
				while(i-temp>=0&&i+temp<c.length){
	    			if(c[i-temp]==c[i+temp]){
	    				if(2*temp>(index[1]-index[0])){
	    					index[0] = i-temp;
		    				index[1] = i+temp;
	    				}
	    			}else{
	    				break;
	    			}
	    			temp++;
	    		}
			}
    	}
    	for(int i = index[0];i<=index[1];i++){
    		res+=c[i];
    	}
    	return res;
    }
}

