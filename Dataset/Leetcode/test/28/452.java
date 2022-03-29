     public int XXX(String haystack, String needle) {

        if (needle.equals("")){
            return 0;
        }

        int j = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) != needle.charAt(j)){
                i -= j;
                j = 0;
            }else {
                j ++;
                if (j == needle.length()){
                    return i - j + 1;
                }
            }
        }

        return -1;
    }

