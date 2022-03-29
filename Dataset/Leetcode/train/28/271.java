 class Solution {
    public int XXX(String haystack, String needle) {
       if (needle.equals("")||needle.equals(null)) {
		return 0;		
	}
	return haystack.indexOf(needle)>=0?haystack.indexOf(needle):-1;
     
    }
}

