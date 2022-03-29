 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        dfs(n, 0, 0, "");
        return res;
    }

    void dfs(int n, int l,int  r, string cur)
    {
        if(l == n && r == n) {
            res.push_back(cur);
            return;
        }
        if(l < n) dfs(n, l+1, r, cur + '(');
        if(r < n && l > r) dfs(n, l, r+1, cur + ')');
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


