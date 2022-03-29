     public int XXX(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            for (int j = i + 1; j <= haystack.length(); j++) {
                if (haystack.substring(i, j).equals(needle)) {
                    return i;
                }
            }
        }
        return needle.length() == 0 || haystack.equals(needle) ? 0 : -1;
    }

