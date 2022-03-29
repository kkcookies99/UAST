 class Solution {
public:
    string XXX(int n) {
        string s="1";
        return dfs(n-1,s);
    }
    string dfs(int n, string s)
    {
        if (n == 0)
            return s;
        int tmp = s[0] - '0';
        string res = "";
        int len = 0, i;
        for (i = 0; i < s.size(); i++) {
            if (s[i] - '0' == tmp)
                len++;
            else {
                res += to_string(len) + to_string(tmp);
                tmp = s[i] - '0';
                len = 1;
            }
        }
        if (i == s.size())
            res += to_string(len) + to_string(tmp);
        return dfs(n - 1, res);
    }
};

