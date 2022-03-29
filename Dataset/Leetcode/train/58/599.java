class Solution {
    public int XXX(String s) {
        boolean flag = true;
		int count = 0;
		s = s.trim();
		for(int i = s.length()-1;i>=0;i--) {
			if(s.charAt(i) == ' ') {
				break;
			}
			count++;
		}
		return count; 
    }
}

