 class Solution {
public:
    int getNext(string t, char c, int &j, vector<int> &next) {
        while (j != -1 && t[j + 1] != c) j = next[j];
        if (t[j + 1] == c)  j++;
        return j;
    }

    int XXX(string haystack, string needle) {
        if (needle.empty()) return 0;
        if (haystack.size() < needle.size()) return -1;
        int m = needle.size();
        vector next(m,-1);
        int j = -1;
        for (int i = 1; needle[i]; ++i) {
            next[i] = getNext(needle,needle[i],j, next);
        }
        j = -1;
        for (int i = 0; haystack[i]; ++i) {
            getNext(needle, haystack[i], j, next);
            if (j == m - 1) return i - m + 1;
        }
        return -1;
    }
};

