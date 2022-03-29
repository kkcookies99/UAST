 class Solution {
    public int XXX(String haystack, String needle) {
        return rk(haystack, needle);
    }

    private boolean arrayEquals(char[] template, int begin, char[] pattern) {
        for (int i = 0; i < pattern.length; i ++) {
            if (template[begin + i] != pattern[i]) {
                return false;
            }
        }
        return true;
    }

    private int rk(String haystack, String needle) {
        char[] str = haystack.toCharArray();
        char[] pattern = needle.toCharArray();
        int strLen = str.length;
        int patternLen = pattern.length;
        if (strLen <= patternLen) {
            return haystack.equals(needle) ? 0 : -1;
        }
        int factor = 1;
        int pHash = 0;
        int tmp = 0;
        for (int i = 0; i < patternLen; i++) {
            pHash = 26 * pHash + (pattern[i] - 'a');;
            tmp = 26 * tmp + (str[i] - 'a');
            factor = i > 0 ? factor * 26 : 1;
        }
        for (int i = 0; i < strLen - patternLen + 1; i++) {
            if (tmp == pHash && arrayEquals(str,i,pattern)) {
                return i;
            }
            if (i + patternLen == strLen) return -1;
            tmp = (tmp - (str[i] - 'a') * factor) * 26 + str[i + patternLen] - 'a';
        }
        return -1;
    }

}```

