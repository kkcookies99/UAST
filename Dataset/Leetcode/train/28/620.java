 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.equals("")) return 0;
        if (haystack.equals("")) return -1;
        if (haystack.length() < needle.length()) return -1;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String target = haystack.substring(i, i + needle.length());
            if (target.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}

