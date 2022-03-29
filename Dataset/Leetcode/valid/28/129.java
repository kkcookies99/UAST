 class Solution {
    public int XXX(String haystack, String needle) {
        
        if(needle.length() == 0) return 0;
        int j = 0;
        int fir = -1;
        boolean f = false;
        for(int i = 0; i < haystack.length(); i++){
            if(haystack.charAt(i) == needle.charAt(j)){
                if(j == 0) {
                    fir = i;
                    f = true;
                }
                j++;
                if (j >= needle.length())
                    break;
            } else {
                j = 0;
                if (f) {
                    i = fir;
                    f = false;
                }
            }
        }
        if (j < needle.length())
            fir = -1;
        return fir;
    }
}

