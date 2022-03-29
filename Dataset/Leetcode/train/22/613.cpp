 class Solution {
public:
    string s;
    vector<string> res;
    vector<string> XXX(int n) {
        dfs(n,s,0,0);
        return res;
    }
    void dfs(int n,string s,int left,int right)
    {
        if(left > n || right > left ) return;
        if(s.length() == n * 2)
        {
            if(left == right)
            {
                res.push_back(s);
                return;
            }
        }
        dfs(n,s+'(',left + 1,right);
        dfs(n,s+')',left,right + 1);

        return;
    }
    
};

