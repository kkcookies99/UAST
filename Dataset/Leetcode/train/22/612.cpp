 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        string path;
        backtrack(res,path,n,0,0);
        return res;
    }
    void backtrack(vector<string>& res,string path,int n,int left,int right)
    {
        if(path.size()==n*2)
        {
            res.push_back(path);
            return;
        }
        if(left<n)
        {
            path.push_back('(');
            backtrack(res,path,n,left+1,right);
            path.pop_back();
        }
        if(right<left)
        {
            path.push_back(')');
            backtrack(res,path,n,left,right+1);
            path.pop_back();
        }
    }
};

