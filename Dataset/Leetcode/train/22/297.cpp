 class Solution {
public:
    vector<string> res;
    vector<string> XXX(int n) {
        string tmp;
        backtrack(tmp,n,0,0,0);
        return res;
    }
    void backtrack(string& tmp ,int n, int idx, int lc, int rc){
        if(idx==2*n && lc==rc){
            res.push_back(tmp);
            return;
        }
        if(lc>n||rc>lc)//右括号大于左括号数量或者左括号数量过半就返回
            return;
        tmp.push_back('(');
        backtrack(tmp,n,idx+1,lc+1,rc);
        tmp.pop_back();
        tmp.push_back(')');
        backtrack(tmp,n,idx+1,lc,rc+1);
        tmp.pop_back();
    }
};

