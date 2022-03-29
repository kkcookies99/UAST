public String XXX(String s) {
		if(s.equals("") == false) {
			Map<Integer,String> map = new HashMap<Integer,String>();
			String str = "";
			int len = 0;
	        for(int i = 0; i < s.length(); i++) {
	        	for(int j = i; j < s.length();j++) {
	        		str += String.valueOf(s.toCharArray()[j]);
	        		if(isKaibun(str)) {
	        			map.put(str.length(), str);
	        			if(len < str.length()) {
	        				len = str.length();
	        				
	        			}
	        		}
	        	}
	        	str = "";
	        }
			
			return map.get(len);
		}else {
			return "";
		}
		
    }
	
	public boolean isKaibun(String s) {
		StringBuffer sb = new StringBuffer(s);
		String str = sb.reverse().toString();
		if(str.equals(s)) 
			return true;
		return false;
		
	}

