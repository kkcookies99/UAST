 class Solution {
public:
    int XXX(string s, string p) {
        int n = s.size(), m = p.size();
        if (m == 0) return 0;
        // 预处理 next 值
        vector<int> ne(m);
        ne[0] = -1;
        for (int i = 1, j = -1; i < m; ++i) {
            while (j != -1 && p[i] != p[j + 1]) j = ne[j];
            if (p[i] == p[j + 1]) ++j;
            ne[i] = j;
        }
        // 匹配
        for (int i = 0, j = -1; i < n; ++i) {
            while (j != -1 && s[i] != p[j + 1]) j = ne[j];
            if (s[i] == p[j + 1]) ++j;
            if (j == m - 1) return i - m + 1;
        }
        return -1;
    }
};

