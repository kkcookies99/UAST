 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        dfs("", 0, n, &res);
        return res;
    }
    
    void dfs(const string& path, int m, int n, vector<string>* res) {
        // m 表示还可以用的右括号的数量，n 表示还可以用几个左括号的数量
        if (m == 0 && n == 0) {
            if (!path.empty()) res->push_back(path);
            return;
        }
    
        if (n > 0) dfs(path + '(', m + 1, n - 1, res);
        if (m > 0) dfs(path + ')', m - 1, n, res);
    }
};

