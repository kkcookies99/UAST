class Solution {
    public  String XXX(int n) {
    	if(n==1) {
    		return "1";
    	}else {
    		return nextstring(XXX(n-1));
    	}
    }
        public static String nextstring(String s) {
    	StringBuilder s1 = new StringBuilder("");
    	char[] sarr=s.toCharArray();
    	int num=1;
    	for(int i=0;i<sarr.length-1;i++) {
    		if(sarr[i]!=sarr[i+1]) {
    			s1.append(num);
    			s1.append(sarr[i]);
    			num=0;
    		}
    		num++;
    	}
    	if(num==0) {
    		s1.append('1');
    		s1.append(sarr[sarr.length-1]);
    	}else{
			s1.append(num);
			s1.append(sarr[sarr.length-1]);
    	}
    	return s1.toString();
    }
}

