class Solution {
    public int XXX(String str) {
    str=str.trim();
    	if(str.equals("")||((str.charAt(0)>'9'||str.charAt(0)<'0')&&str.charAt(0)!='-'&&str.charAt(0)!='+')) {
    		return 0;
    	}else {
    		long sum=0;
    		if(str.charAt(0)=='-') {
    			int i=1;
    			if(i<str.length()&&(str.charAt(1)>'9'||str.charAt(1)<'0')) {
    				return 0;
    			}else {
    				while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9') {
    					sum=sum*10-Long.parseLong(String.valueOf(str.charAt(i)));
    					i++;
    					if(sum<-2147483648) {
        					return -2147483648;
        				}
    				}
    					return (int)sum;
    			}
    		}else if(str.charAt(0)=='+') {
    			int i=1;
    			if(i<str.length()&&(str.charAt(1)>'9'||str.charAt(1)<'0')) {
    				return 0;
    			}else {
    				while(i<str.length()&&str.charAt(i)>='0'&&str.charAt(i)<='9') {
    					sum=sum*10+Long.parseLong(String.valueOf(str.charAt(i)));
    					i++;
    					if(sum>2147483647) {
        					return 2147483647;
        				}
    				}

    					return (int)sum;
    			}
    		}
    		else {
    			if((str.charAt(0)>'9'||str.charAt(0)<'0')) {
				return 0;
				}else {
    				sum=Long.parseLong(String.valueOf(str.charAt(0)));
    				int i=1;
    				while(i<str.length()&&(str.charAt(i)>='0'&&str.charAt(i)<='9')) {
    					sum=sum*10+Long.parseLong(String.valueOf(str.charAt(i)));
    					i++;
    					if(sum>2147483647) {
        					return 2147483647;
        				}
    				}
    					return (int)sum;
    			}
    			
    		}
    	}
    }    
}

