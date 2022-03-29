 class Solution {
    vector<string> ans;
public:
    vector<string> XXX(int n) {
        
        string s = "";
        dfs(s, n, n);
        return ans;
    }

    void dfs(string s, int l, int r){
        if(l == 0 && r == 0) ans.push_back(s);
        if(l > 0) dfs(s+'(', l-1, r);
        if(r > l) dfs(s+')', l, r-1);
    }
};




