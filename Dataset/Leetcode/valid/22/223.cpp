 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        dfs(0,0,n,res,"");
        return res;
    }
    void dfs(int l, int r ,int n , vector<string>& res , string temp){
        if(temp.size() == 2*n){
            res.push_back(temp);
            return;
        }
        if(l < n) dfs(l+1 , r , n ,res , temp + "(");
        if(r < l) dfs(l , r+1 , n , res , temp + ")");
        return;
    }
};

