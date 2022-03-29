 public int XXX(String haystack, String needle) {
        if (needle == null){
            return 0;
        }
        if (haystack == null){
            return -1;
        }
        int h = 0;
        int n = 0;
        while (h <haystack.length() && n < needle.length()){
            if(haystack.charAt(h)== needle.charAt(n)){
                n ++;
                h ++;
            }else{
                h = h - n +1;
                n = 0;
            }
        }
        if(n == needle.length()){
            return h - n;
        }
        return -1;
    }

