 public String XXX(String[] strs) {
        if(strs.length==0) {
			return "";
		}
		if(strs.length==1) {
			return strs[0];
		}
		int minLen=strs[0].length();
		for(String str:strs) {
			minLen=Math.min(minLen, str.length());
		}
        int totalLen=-1;
		for(int i=0;i<minLen;i++) {
			char c=strs[0].charAt(i);
			for(int j=1;j<strs.length;j++) {
				if(c!=strs[j].charAt(i)) {
					if(i==0) {
						return "";
					}
					return strs[0].substring(0,i);
				}else{
                    totalLen=i;
                }
			}
		}
		return strs[0].substring(0,totalLen+1);
    }

