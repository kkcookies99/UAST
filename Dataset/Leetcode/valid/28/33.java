 class Solution {
    public int XXX(String haystack, String needle) {
        if (!haystack.contains(needle)) { return -1; }
        if (needle.isEmpty()) { return 0; }

        haystack = haystack.replaceAll(needle,"A");

        for(int i = 0;i < haystack.length(); i++) {
            if (haystack.charAt(i) == 'A') {
                return i;
            }
        }

        return -1;
    }
}

