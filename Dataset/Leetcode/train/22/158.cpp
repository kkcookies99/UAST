 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        helper(res,"",n,n);
        return res;
    }
    void helper(vector<string> &res,string restmp,int left,int right)
    {
        if(left==0 && right==0)
        {
            res.push_back(restmp);
            return;
        }
        if(right<left) return;//此时得到的括号对不符合要求
        if(left>0)
            helper(res,restmp+'(',left-1,right);
        if(right>0)
            helper(res,restmp+')',left,right-1);
    }
};

