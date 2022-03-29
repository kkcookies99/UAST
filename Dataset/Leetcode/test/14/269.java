 class Solution {
    public String XXX(String[] strs) {
		if(strs ==null || strs.length==0) {return "";}
		
		String tmp = strs[0];
		for(String t:strs) {
			if(t.length()<tmp.length()) tmp = t;
		}
		while(tmp!=null) {
			boolean flag = true;
			for(int i=0; i<strs.length; i++) {
				if(!strs[i].startsWith(tmp)) {
					flag = false;
					break;
				}
			}
			if(flag) return tmp;
			tmp = tmp.substring(0, tmp.length()-1);
		}
		return tmp;
    }
}

