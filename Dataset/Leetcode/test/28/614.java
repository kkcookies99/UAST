 class Solution {
    public int XXX(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        if (n == 0) return 0;
        int[] next = getNext(needle);
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)) {
                ++i;++j;
            } else {
                j = next[j];
            }
        }
        return j == n ? i - n : -1;
    }
    private int[] getNext(String needle) {
        int n = needle.length();
        int[] next = new int[n];
        next[0] = -1;
        int i = 0, j = -1;
        while (i < n - 1) {
            if (j == -1 || needle.charAt(i) == needle.charAt(j)) {
                next[++i] = ++j;
            } else {
                j = next[j];
            }
        }
        return next;
    }
}```

