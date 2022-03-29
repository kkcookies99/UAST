 class Solution {
public:
    string XXX(string s) {
        int n = static_cast<int>(s.size());
        int maxlen = 0;
        int p = 0, q = 0;
        int start = 0, end = 0;
        int nt = -1;
        for (int i = 0; i < n;) {
            p = i - 1;
            q = i + 1;
            char c = s[i];
            while (p >= 0 && s[p] == c) {
                --p;
            }
            while (q < n && s[q] == c) {
                ++q;
            }
            nt = q;
            while (p >= 0 && q < n && s[p] == s[q]) {
                --p;
                ++q;
            }
            int dist = q - p - 1;
            if (dist > maxlen) {
                maxlen = dist;
                start = p + 1;
            }
            i = nt;
        }
        string subs = s.substr(start, maxlen);
        return subs;
    }
};

