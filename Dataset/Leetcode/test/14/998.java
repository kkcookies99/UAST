 class Solution {
    public String XXX(String[] strs) {
            String[] s = strs[0].split("");
		String anString=new String();
		String stem = new String();
		for (int i = 1; i <= s.length; i++) {
			stem += s[i - 1];
			for (int j = 1; j < strs.length; j++) {
				if (strs[j].startsWith(stem)) continue;
				else return anString;
			}
			anString=stem;
		}

		return anString;
    }
}

