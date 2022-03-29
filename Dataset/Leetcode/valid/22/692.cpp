 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        int l = n, r = n;
        dfs(l, r, "");
        return res;
    }
    void dfs(int l, int r, string str) {
        if (l < 0 || r < 0 || l > r)
            return ;
        if (l == 0 && r == 0) {
            res.push_back(str);
            return ;
        }
        dfs(l - 1, r, str + "(");
        dfs(l, r - 1, str + ")");
    }
};

