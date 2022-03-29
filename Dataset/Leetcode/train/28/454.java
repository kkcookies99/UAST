 class Solution {
    public int XXX(String haystack, String needle) {

        if (needle == null) {
	    return 0;
	}
        if (haystack.length() < needle.length()){
            return -1;
        }

        int index = 0;
            while(!haystack.startsWith(needle)) {
                index++;				
                haystack = haystack.substring(1,haystack.length());	
                if (haystack.length() < needle.length()) {
                    return -1;
                }
                
            }
        return index;
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


