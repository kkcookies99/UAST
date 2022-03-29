 class Solution {
public:
    vector<int> getNext(string s) {
        vector<int> ret(s.length(), 0);
        if (ret.empty()) return ret;
        for (size_t k1(1), kt(0); k1 < ret.size(); ++k1) {
            while (kt && s[kt] != s[k1]) kt = ret[kt - 1];
            if (s[kt] == s[k1]) ++kt;
            ret[k1] = kt;
        }
        return ret;
    }

    int kmp(string s1, string s2) {
        int sl1(s1.length()), sl2(s2.length());

        auto nv2(getNext(s2));
        for (int k1(0), k2(0); k1 < sl1;) {
            if (s1[k1] == s2[k2]) ++k1, ++k2;
            else if (k2) k2 = nv2[k2 - 1];
            else ++k1;
            if (k2 == sl2) {
                return k1 - k2; 
                k2 = nv2[k2 - 1];
            }
        }
        return -1;
    }

    int XXX(string haystack, string needle) {
        if (!needle.size()) return 0;
        if (haystack == needle) return 0;

        return kmp(haystack, needle);
    }
};

