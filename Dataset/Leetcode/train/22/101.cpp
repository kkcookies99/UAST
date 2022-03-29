 class Solution {
public:
    vector<string> res;
    void dfs(string tmp,int l,int r,int n){
        if(tmp.size()==2*n){
            res.push_back(tmp);
            return;
        }
        if(l<n) dfs(tmp+"(",l+1,r,n);
        if(r<l) dfs(tmp+")",l,r+1,n);
    }
    vector<string> XXX(int n) {
        dfs("",0,0,n);
        return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

