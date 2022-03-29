 class Solution {
    public int XXX(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        int i = 0, j = needle.length();
        while (j <= haystack.length()) {
            if (needle.equals(haystack.substring(i++, j++))) {
                return i - 1;
            }
        }
        return -1;
    }
}

