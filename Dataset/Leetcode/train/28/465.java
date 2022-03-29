 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.length() <=0 ) {
            return 0;
        }
        int i = 0;
        int len = haystack.length();
        boolean find = false;
        for(; i < len; i++) {
            find = true;
            for(int j = 0, len1 = needle.length(); j < len1; j++) {
                if (i + len1 > len) {
                    find = false;
                    break;
                }
                if (haystack.charAt(j + i) != needle.charAt(j)) {
                    find = false;
                    break;
                }
            }
            if (find) {
                break;
            }
        }
        if (i >= len ) {
            i = -1;
        }
        return i;
    }
}

