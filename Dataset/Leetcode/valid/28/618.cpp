 class Solution {
public:
    int XXX(string s, string p) {
        int n = s.size(), m = p.size();
        if (m == 0) return 0;
        if (n < m) return -1;
        s = " " + s;
        p = " " + p;
        vector<int> ne(m+1, 0);
        for (int i = 2, j = 0; i <= m; i ++) {
            while(j && p[i] != p[j+1]) j = ne[j];
            if (p[i] == p[j+1]) j ++;
            ne[i] = j;
        }
        for (int i = 1, j = 0; i <= n; i ++) {
            while(j && s[i] != p[j+1]) j = ne[j];
            if (s[i] == p[j+1]) j ++;
            if (j == m) return i - m;
        }
        return -1;
    }
};
/***
"hello"
"ll"
"aaaa"
"bba"
""
""
*/


