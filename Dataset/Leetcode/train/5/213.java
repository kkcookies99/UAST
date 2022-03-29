 public  String XXX(String s) {
                         //存放所有的回文串
                        Set<String> palindromes = new HashSet<>();
	        s = s.trim();
	        if(s.equals(new StringBuilder(s).reverse().toString())) {
	        	return s;
	        }else {
	        	int len = s.length();
	        	for(int i=0;i<len;i++) {
		        	for(int j=i+1;j<=len;j++) {
		        		String str = s.substring(i, j);
		        		if(str.equals(new StringBuilder(str).reverse().toString())) {
		        			palindromes.add(str);
		        		}
		        	}
		        }
		        Iterator<String> iterator =  palindromes.iterator();
		        String candidate = iterator.next();
		        while(iterator.hasNext()) {
		        	String second = iterator.next();
		        	if(candidate.length()<second.length()) {
		        		candidate = second;
		        	}
		        }
		        return candidate;
	        }
	        
	  }