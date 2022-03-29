 class Solution {
public:
    vector<string> XXX(int n) {
        dfs(n, 0);
        return res;
    }
private:
    string ans;
    vector<string> res;
    void dfs(int left, int right) {
        if (!left && !right) res.push_back(ans);
        if (left > 0) {
            ans += '(';
            dfs(left - 1, right + 1);
            ans.pop_back();
        }
        if (right > 0) {
            ans += ')';
            dfs(left, right - 1);
            ans.pop_back();
        }
    }
};

