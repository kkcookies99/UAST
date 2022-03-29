 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        int[] next = new int[needle.length()+1];
        getNext(needle, next);
        return kmp(haystack, needle, next);
    }

    private int kmp(String t, String p, int[] next) {
        int i = 0, j = 0;
        while (i < t.length() && j < p.length()) {
            if (j == -1 || t.charAt(i) == p.charAt(j)) {
                i ++;
                j ++;
            } else {
                j = next[j];
            }
        }
        if (j == p.length()) {
            return i-j;
        }
        return -1;
    }

    private void getNext(String t, int[] next) {
        next[0] = -1;
        int i = 0, j = -1;
        while (i < t.length()) {
            if (j == -1 || t.charAt(i) == t.charAt(j)) {
                
                i ++;
                j ++;
                next[i] = j;
            } else {
                j = next[j];
            }
        }
        
    }
}

