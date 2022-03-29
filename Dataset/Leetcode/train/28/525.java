 class Solution {
    public int XXX(String haystack, String needle) {
        int hLength = haystack.length();
        int nLength = needle.length();
        if (nLength == 0)
            return 0;
        if (nLength > hLength)
            return -1;
        int flag = 0;
        for (int i = 0; i < hLength; ++i) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (i + nLength > hLength)
                    return -1;
                for (int j = 1; j < nLength && flag == 0; ++j) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        flag = 1;
                    }
                }
                if (flag == 0)
                    return i;
            }
            flag = 0;
        }
        return -1;
    }
}

