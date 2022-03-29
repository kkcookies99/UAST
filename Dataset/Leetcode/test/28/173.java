  public int XXX(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        int h = haystack.length();
        int n = needle.length();
        for (int i = 0; i < h; i++) {
            if (h - i < n) {
                return -1;
            }
            if (haystack.charAt(i) != needle.charAt(0)) {
                continue;
            }
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

