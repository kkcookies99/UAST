class Solution {
public:
    string XXX(string a, string b) {
        string res;
        int i = a.size() - 1, j = b.size() - 1, t = 0;
        while (i >= 0 || j >= 0 || t) {
            if (i >= 0) t += (a[i] - '0'), i -- ;
            if (j >= 0) t += (b[j] - '0'), j -- ;
            res = to_string(t % 2) + res;
            t >>= 1;
        }
        return res;
    }
};

