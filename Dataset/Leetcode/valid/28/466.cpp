 class Solution {
public:
    int XXX(string haystack, string needle) {
        int p = 0, q = 0;
        //几种特殊情况
        if (needle.size() == 0) {
            return 0;
        } else if (haystack == needle) {
            return 0;
        } else if (haystack.size() == 0) {
            return -1;
        } else if (haystack.size() < needle.size()) {
            return -1;
        }
        while (p < haystack.size() && q < needle.size()) {
            if (haystack[p] == needle[q]) {
                ++p;
                ++q;
            } else {
                //p要回退，q的值可看做已匹配的长度
                p -= q;
                q = 0;
                //p回退后再后移
                ++p;
            }
        }

        if (q == needle.size()) {
            return p - q;
        }
        return -1;
    }
};