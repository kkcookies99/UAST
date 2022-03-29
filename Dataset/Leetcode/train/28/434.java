 public int XXX(String haystack, String needle) {
        if(needle.trim().length() == 0 && haystack.trim().length() == 0)
            return 0;
        int index = haystack.indexOf(needle);
        return index;
    }

