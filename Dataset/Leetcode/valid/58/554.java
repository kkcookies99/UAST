class Solution {
    public int XXX(String s) {
        s = s.trim();
		int num = 0;
        int len = s.length();
        int res = 0;
        if(s.contains(" ")) {
        	for(int i = len-1;i>=0;i--) {
            	char c = s.charAt(i);
            	if(c == ' ') {
            		num = i;
            		break;
            	}
            }
        	String str = s.substring(num+1);
        	res = str.length();
        }
        else {
        	res = s.length();
        }
        return res;
    }
}

