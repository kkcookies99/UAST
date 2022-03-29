 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.equals("")) return 0;
        int l = haystack.length();
        int s = needle.length();
        if (l < s) return -1;
        int flag = -1;
        for (int i = 0; i < l; i++) {
            if ((i + s) <= haystack.length()) {
                if (haystack.charAt(i) == needle.charAt(0) && needle.equals(haystack.substring(i, i+s))) {
                    flag = i;
                    break;
                }
            }
        }
        return flag;
    }
}

