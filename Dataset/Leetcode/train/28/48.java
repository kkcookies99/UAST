 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int len = needle.length();
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                if (j == len - 1) {
                    return i - j;
                }
                j++;
            }else {
                i = i - j;
                j = 0;
                if (haystack.length() - i < len) {
                    return -1;
                }
            }
        }

        return -1;
    }
}

