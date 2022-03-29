class Solution {
public:
    string XXX(int n) {
        if (n == 1) return "1";
        auto s = XXX(n - 1);
        int i = 0;
        int m = s.size() ;
        string res = "";
        while (i < m) {
            int cnt = 0;
            char cur = s[i];
            while (i < m && s[i] == cur) {
                cnt++;
                i++;
            }
            res += to_string(cnt);
            res.push_back(cur);
        }
        return res;
    }
};


