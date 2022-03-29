 class Solution {
public:
    int XXX(string h, string t) {
        int n = h.size(), m = t.size();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (h[i] == t[j]) ++i, ++j;
            else i = i - j + 1, j = 0;
        }
        return j == m ? i - m : -1;
    }
};

