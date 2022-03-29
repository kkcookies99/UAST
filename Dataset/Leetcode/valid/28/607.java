  public int XXX(String haystack, String needle) {
 if ("".equals(haystack)) {
            if ("".equals(needle)) {
                return 0;
            } else {
                return -1;
            }
        }
        if ("".equals(needle)) {
            return 0;
        }
        if (haystack.equals(needle)){
            return 0;
        }
        int length = needle.length();
        int i = 0;
        while (i <= haystack.length()-length) {
            if (haystack.substring(i,i+length).equals(needle)){
                return i;
            }
            i++;
        }
        return -1;
    }

