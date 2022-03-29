     public String XXX(String a, String b) {
        StringBuffer result = new StringBuffer(); 
        int i = a.length() - 1, j = b.length() -1;
        int flag = 0;
        
        for(; i >= 0 || j >= 0; i--,j--){
        	int a1 = i >= 0 ? a.charAt(i) - '0' : 0;
        	int b1 = j >= 0 ? b.charAt(j) - '0' : 0;	
        	int tmp = a1 + b1 + flag;
        	
        	if(tmp < 2){
        		result.append(tmp + "");
        		flag = 0;
        	}		
        	else if(tmp == 2){
        		result.append("0");
        		flag = 1;
        	}else{
        		result.append("1");
        		flag = 1;
        	}
        }
        if(flag == 1){
        	result.append("1");
        }
        return result.reverse().toString();
    }

