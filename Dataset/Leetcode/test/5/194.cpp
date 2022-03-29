 class Solution {
public:
    string res;
    string XXX(string s) {
        for (int i = 0; i < s.size(); i++) {
            solve(s, i, i);
            solve(s, i, i + 1);
        }

        return res;
    }
    void solve(string &s, int l, int r) {
        string tmp = "";
        while (l > -1 and r < s.size() and s[l] == s[r]) {
            
            l--;
            r++;
        }
        tmp = string(s.begin() + l+1, s.begin() + r );
        if (tmp.size() > res.size()) {
            res = tmp;
        }
    }
};

