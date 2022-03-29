 class Solution {
public:
    map<char, int> m = { { 'I',1},{'V',5},{'X',10},{'L',50},{'C',100},{'D',500},{'M',1000} };
    int XXX(string s) {
        int r = m[s.back()];
        for (int p = s.size() - 2; p >= 0; p--)
            r += m[s[p]] * (m[s[p]] >= m[s[p + 1]] ? 1 : -1);
        return r;
    }
};

