 class Solution {
    public String XXX(String s) {
    	int n = s.length();
    	String ans = s.substring(0, 1);
    	
    	for(int i = 0; i < n; i++) {
    		String s1 = strPali(s, i - 1, i + 1);
    		String s2 = strPali(s, i, i + 1);
    		String bigger = s1.length() > s2.length() ? s1 : s2;
    		ans = ans.length() > bigger.length() ? ans : bigger;
    	}
    	return ans;
    }
    
    public String strPali(String s, int lo, int hi) {
    	if(lo < 0 || hi >= s.length() || lo >= hi)
    		return "";
    	while(lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)) {
    		lo--;
    		hi++;
    	}
    	lo++;
    	hi--;
    	return s.substring(lo, hi + 1);
    }
}

