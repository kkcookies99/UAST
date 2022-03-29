 class Solution {
public:
    vector<string>res;
    vector<string> XXX(int n) {
        dfs(n,n,"");
        return res;
    }
    void dfs(int l,int r,string path){
        if(!l&&!r){
            res.push_back(path);
            return;
        }
        if(l) dfs(l-1,r,path+'(');
        if(l<r) dfs(l,r-1,path+')');
    }
};

