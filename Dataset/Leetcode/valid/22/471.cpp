 class Solution {
public:
    int n;
    vector<string> res;
    vector<string> XXX(int _n) {
        n = _n;
        dfs(0, 0, "");
        return res;
    }
    void dfs(int l, int r, string path)
    {
        if (l == r && r == n) res.push_back(path);
        else
        {
            if (l < n) dfs(l + 1, r, path + "(");
            if (r < l) dfs(l, r + 1, path + ")");
        }
    }
};

