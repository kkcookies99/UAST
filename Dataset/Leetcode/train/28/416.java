 class Solution {
    public int XXX(String haystack, String needle) {
        int s1 = 0,s2 = 0;
        while (s1 < haystack.length() && s2 != needle.length()) {
            if (haystack.charAt(s1) == needle.charAt(s2)) {
                s2++;
            } else {
                s1 = s1 - s2;
                s2 = 0;
            }
            s1++;
        }
        return s2 == needle.length()?s1 - s2: -1;
    }
}

