  public boolean XXX(String s) {
		char[] ch = s.toLowerCase().toCharArray();
		int i = 0;
		int j = ch.length-1;
		while(i<j) {
			while(i<j&&!isletter(ch[i])) {
				i++;
			}
			while(i<j&&!isletter(ch[j])) {
				j--;
			}
			if(ch[i]!=ch[j]) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
	}
	public boolean isletter(char c) {
		 if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
             return true;
         }else {
        	return false; 
         }
	}

