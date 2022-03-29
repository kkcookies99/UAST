 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        dfs("", n, 0, 0);
        return res;
    }

    void dfs(string path, int n, int l, int r)
    {
        if (l == n && r == n) res.push_back(path);
        else
        {
            if (l < n) dfs(path + '(', n, l + 1, r);
            if (r < n && l > r) dfs(path + ')', n, l, r + 1);
        }

        return;
    }
};

