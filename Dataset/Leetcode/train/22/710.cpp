 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        dfs(res, "", 0, 0, n);
        return res;
    }
private:
    void dfs(vector<string>& res, string s, int l, int r, int n){
        if(r > l || l > n || r > n) return;
        else if(l == r && l == n){
            res.push_back(s);
            return;
        }
        dfs(res, s+"(", l+1, r, n);
        dfs(res, s+")", l, r+1, n);
    }
};

