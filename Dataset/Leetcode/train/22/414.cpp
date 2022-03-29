 class Solution {
public:
    vector<string> ans;
    vector<string> XXX(int n) {
        dfs("",0,n*2);
        return ans;
    }
    void dfs(string s,int t,int target)
    {
        if (s.length()==target)
        {
            if (t==0) ans.push_back(s);
            return;
        }
        dfs(s+'(',t+1,target);
        if (t) dfs(s+')',t-1,target); 
    }
};

