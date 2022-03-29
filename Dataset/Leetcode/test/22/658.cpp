 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        dfs("",n,n);
        return res;
    }
    void dfs(string s,int left,int right)
    {
        if(right==0)res.push_back(s);
        if(left>0)//如果还能填左括号，那就填
        dfs(s+"(",left-1,right);
        if(right>0&&left<right)//如果还能填右括号，且左括号数小于右括号，那就填右括号
        dfs(s+")",left,right-1);
    }
};

