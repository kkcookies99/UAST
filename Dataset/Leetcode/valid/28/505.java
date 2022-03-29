 public int XXX(String haystack, String needle) {
        if ("".equals(needle)) return 0;
        for (int i = 0; i+needle.length()<=haystack.length(); i++) {
            //if (haystack.substring(i, i+ needle.length()).equals(needle)) return i;
            if (haystack.startsWith(needle, i)) return i;
        }
        return -1;
    }

