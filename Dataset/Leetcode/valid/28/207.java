 public int XXX(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        for (int i = 0, j = 0; i < haystack.length(); ) {
            if (i + needle.length() > haystack.length()) return -1;
            if (haystack.charAt(i + j) != needle.charAt(j)) {
                i++;
                j = 0;
            } else {
                j++;
            }
            if (j == needle.length()) return i;
        }
        return -1;
        //return haystack.indexOf(needle);
    }

