 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        char[] hs = haystack.toCharArray();
        char[] ns = needle.toCharArray();
        for (int i=0, len=hs.length-ns.length+1; i<len; i++) {
            for (int j=0; j<ns.length; j++) {
                if (hs[i+j] != ns[j]) {
                    break;
                }
                if (j == ns.length-1) {
                    return i;
                }
            }
        }
        return -1;
    }
}

