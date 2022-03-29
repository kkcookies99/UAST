 class Solution {
public:
    vector<string> ans;
    void dfs(string s,int n,int l,int r){
        if(l>n || r>n|| r>l) return ;
        if(l==n && r==l){
            ans.push_back(s);
            return ;
        }
        dfs(s+'(',n,l+1,r);
        dfs(s+')',n,l,r+1);
    }
    vector<string> XXX(int n) {
        string s="";
        dfs(s,n,0,0);
        return ans;
    }
};

