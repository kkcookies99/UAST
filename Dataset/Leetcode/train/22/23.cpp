 class Solution {
public:
    vector<string> ans;
    vector<string> XXX(int n) {
        if (n < 0) return {};
        dfs(n, "", 0,0);
        return ans;
    }
    void dfs(int n, string cur, int l,  int r) {
        if (r > l) return;
        if (l == n) {
            ans.push_back(cur + string(n-r, ')'));
            return;
        }
        dfs(n, cur + "(", l+1, r);
        dfs(n, cur + ")", l, r+1);
    }
};

