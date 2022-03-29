 class Solution {
public:
    vector<string> ans;
    void dfs(string s,int cnt,int n)
    {
        if (cnt > 0) return;
        int len = s.size();
        if (cnt == 0 && len == 2 * n)
        {
            ans.push_back(s);
        }
        if (len >= 2 * n) return;
        dfs(s + '(', cnt - 1, n);
        dfs(s + ')', cnt + 1, n);
    }
    vector<string> XXX(int n) {
        dfs("", 0, n);
        return ans;
    }
};

