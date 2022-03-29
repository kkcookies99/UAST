 class Solution {
public:
    vector<string> XXX(int n) {
        string tmp;
        vector<string> res;

        function<void(int, int, int)> dfs = [&](int n, int l, int r) {
            if (l == n && r == n) {
                res.push_back(tmp);
                return;
            }

            if (l < n) {
                tmp.push_back('(');
                dfs(n, l + 1, r);
                tmp.pop_back();
            }

            if (l > r) {
                tmp.push_back(')');
                dfs(n, l, r + 1);
                tmp.pop_back();
            }
        };

        dfs(n, 0, 0);
        return res;
    }
};

