 class Solution {
    public int XXX(int x) {
        char[] c = String.valueOf(x).toCharArray();
	    StringBuilder s =new StringBuilder("");
	    for (int i = c.length-1; i > -1; i--) {
	    	if(c[i] == '-') {
	    		s.insert(0, c[i]);
	    		continue;
	    	}
	    	s.append(c[i]);
		}
	    int i = 0;
	    try {
	    	i = Integer.parseInt(s.toString());
	    }catch (Exception e) {
			
		}
		return i;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


