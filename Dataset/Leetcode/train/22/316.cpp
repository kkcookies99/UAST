 class Solution {
public:
    vector<string> res;
    void dfs(int n,int lcnt,int rcnt,string now){
        if(lcnt == n && rcnt == n) res.push_back(now);
        else{
            if(lcnt < n) dfs(n,lcnt + 1,rcnt,now + '(');
            if(lcnt > rcnt) dfs(n,lcnt,rcnt + 1,now + ')');
        }
    }
    vector<string> XXX(int n) {
        res.clear();
        dfs(n,0,0,"");
        return res;
    }

};

