 class Solution {
public:
    string XXX(string a, string b) {
        reverse(a.begin(), a.end());
        reverse(b.begin(), b.end());

        string res;

        int t = 0, n = max(a.size(), b.size());
        for(int i = 0; i < n; ++i) {
            t += i < a.size() ? (a[i] == '1') : 0;
            t += i < b.size() ? (b[i] == '1') : 0;
            
            res += (t % 2) + '0';
            t /= 2;
        }
        if(t) res += '1';

        reverse(res.begin(), res.end());

        return res;
    }
};

