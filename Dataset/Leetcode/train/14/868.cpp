 class Solution {
public:
    ~Solution() { if (commonPrefix) delete[] commonPrefix; }
    string XXX(vector<string>& strs) {
        if (commonPrefix) delete[] commonPrefix;
        commonPrefix = new char[strs.front().size() + 1] {};
        memcpy(commonPrefix, strs.front().c_str(), strs.front().size());

        for (auto p = strs.cend() - 1; p != strs.cbegin(); --p) {
            getCommonPrefix(p->c_str());
        }
        return commonPrefix;
    }
    void getCommonPrefix(const char *s) {
        char *cp = commonPrefix;
        while (*cp && *cp == *s++) ++cp;
        *cp = 0;
    }
    char *commonPrefix;
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


