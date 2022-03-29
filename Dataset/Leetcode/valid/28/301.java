     public int XXX(String haystack, String needle) {
        if(haystack == null || needle == null)
            return 0;

        if(needle.length() == 0)
            return 0;

        char first = needle.charAt(0);
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == first) {
                int k = i + 1;
                int j = 1;

                if(j >= needle.length())
                    return i;
                while(k < haystack.length() && j < needle.length()) {
                    if(haystack.charAt(k) == needle.charAt(j)) {
                        k++;
                        j++;
                    } else
                        break;
                }

                if(j == needle.length())
                    return i;
            }
        }

        return -1;
    }

