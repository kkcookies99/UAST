 class Solution {
public:
    vector<string> res;
    void dfs(string ans,int n,int count,int c){
        //cout<<ans<<" "<<count<<endl;
        if(count==n && c==0){
            res.emplace_back(ans);
            return;
        }
        if(count<n){
            dfs(ans+'(',n,count+1,c+1);
        }
        if(c>0){
            dfs(ans+')',n,count,c-1);
        }
    }

    vector<string> XXX(int n) {
        string ans;
        dfs(ans,n,0,0);
        return res;
    }
};

