class Solution {
public:
    string XXX(string a, string b) {
        if (a.size() < b.size()) return XXX(b, a);

        string res = "";
        int v = 0;
        auto it1 = a.rbegin(), it2 = b.rbegin();
        while (it1 != a.rend()) {
            v = v > 1 ? 1 : 0;
            v += (*it1++ == '1');
            if (it2 != b.rend()) v += (*(it2++) == '1');
            res += '0' + (v % 2);
        }
        if (v > 1) res += '1';
        reverse(res.begin(), res.end());

        return res;
    }
};

