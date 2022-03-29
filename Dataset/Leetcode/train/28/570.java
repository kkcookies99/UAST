 class Solution {
    public int XXX(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (needle.length() > haystack.length()) return -1;
        for (int i  = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.length() - i  < needle.length()) return -1;
                boolean notMatch = true;
                for (int j = 1; j < needle.length(); j++ ) {
                    if ((i + j) >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) notMatch = false;
                }
                if (notMatch) return i;
            }
        }
        return -1;
    }
}

