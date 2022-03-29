 class Solution {
public:
    vector<string> res;
    int n;
    void dfs(string s, int left, int right) {
        if (s.length() == 2 * n) {
            res.push_back(s);
            return ;
        }
        if (left < n) dfs(s + "(", left + 1, right);
        if (right < left) dfs(s + ")", left, right + 1);

    }
    vector<string> XXX(int _n) {
        n = _n;
        dfs("(", 1, 0);
        return res;
    }
};

