 class Solution {
public:
    string XXX(string a, string b) {
        string ans;
        int na = a.size();
        int nb = b.size();
        int cf = 0;
        for(int i = 0; i < max(na, nb); i++) {
            char xa = (i < na) ? a[na - i - 1] : '0';
            char xb = (i < nb) ? b[nb - i - 1] : '0';
            int x = cf + (xa - '0') + (xb - '0');
            cf = (x) / 2;
            x %= 2;
            ans.push_back(x + '0');
        }
        if(cf)  ans.push_back(cf + '0');
        reverse(ans.begin(), ans.end());
        return ans;
    }
};

