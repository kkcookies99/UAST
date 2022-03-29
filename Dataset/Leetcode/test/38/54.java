class Solution {

    public static String XXX(int n) {
    	if(n==1)return "1";    	
    	String s="1";
    	for(int i=0;i<n-1;i++) {
    		StringBuffer sb=new StringBuffer();
    		char t=s.charAt(0);
    		int count=0;
    		int j=0;
    		for(j=0;j<s.length();j++) {
    			if(t!=s.charAt(j)) {
    				sb.append(count);
    				sb.append(t);
    				t=s.charAt(j);
    				count=1;
    			}
    			else {
    				count++;
    			}
    				
    		}
    		sb.append(count);
    		sb.append(s.charAt(s.length()-1));
    		s=sb.toString();
    		
    		
    	}
    	
        return s;
    }
}

