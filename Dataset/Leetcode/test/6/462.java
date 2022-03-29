 class Solution {
    public String XXX(String s, int numRows) {
        		// TODO Auto-generated constructor stub
			    int lg=numRows>1?2*numRows-2:1; //得到每个n由多少个字母组成
			    //ArrayList<String>  s1=new ArrayList<String>();
			    char[] s2=s.toCharArray();
			    int count=0;
			    for(int i=0;i<numRows;i++) {
			    	if(i==0) {
			    		for(int k=0;k<s.length();k=k+lg) {
			    			//s1.add(String.valueOf(s.charAt(k)) );
			    		    s2[count]=s.charAt(k);
			    		    count++;
			    		}
			    	}else if(i==numRows-1) {
			    		for(int k=0;k<s.length();k=k+lg) {
			    			if(k+numRows-1<s.length()) {
			    				//s1.add(String.valueOf(s.charAt(k+numRows-1)));
			    				s2[count]=s.charAt(k+numRows-1);
                                count++;
			    			}
			    		}
			    	}else {
			    		for(int k=0;k<s.length();k=k+lg) {
			    			if(k+i<s.length()) {
			    				//s1.add(String.valueOf(s.charAt(k+i)));
			    				s2[count]=s.charAt(k+i);
			    				count++;
			    			}
			    			if(k+lg-i<s.length()) {
			    			    //s1.add(String.valueOf(s.charAt(k+lg-i)));
			    				s2[count]=s.charAt(k+lg-i);
			    				count++;
			    			}
			    		}
			    	}
			    }
		        //System.out.println(String.valueOf(s2));
		        return String.valueOf(s2);
    }
}

