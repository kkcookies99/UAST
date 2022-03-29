 class Solution {
    public boolean XXX(String s) {
		String str = s.replaceAll("[^a-z^A-Z^0-9]", ""); 
		String newstr = str.toLowerCase();
		String rts = (new StringBuilder(newstr + "")).reverse().toString();
		if(newstr.equals(rts)) {
			return true;
		}
		return false;
    }
}

