 class Solution {
public:
    int XXX(string haystack, string needle) {
        int nLenN = needle.length();
        if (0 == nLenN) {
            return 0;
        }

        int nLenH = haystack.length();
        if (nLenH < nLenN) {
            return -1;
        }

        int i = 0;
        int j = 0;
        while (i < nLenH && j < nLenN) {
            if (haystack[i] == needle[j]) {
                ++i;
                ++j;
            } else {
                i -= j - 1;//优化 i 的位置
                j = 0;
            }
        }

        if (j == nLenN) {
            return i - nLenN;
        }

        return -1;
    }
};

