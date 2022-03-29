class Solution {
    public boolean XXX(int x) {
        
			String s = String.valueOf(x);
			StringBuffer sb = new StringBuffer(s);
			if(sb.reverse().toString().equals(s))
				return true;
				return false;
    }
}

