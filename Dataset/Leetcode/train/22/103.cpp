 class Solution {
public:
    void trace_back(int l, int r, int n, string s, vector<string>& res){
        if(l<r||l>n||r>n)return;//优化在这里，单个超过n就直接剪掉
        if(s.size()==2*n&&l==r&&l==n){
            res.push_back(s);
            return;
        }
        trace_back(l+1, r, n, s+'(', res);
        trace_back(l, r+1, n, s+')', res);
    }
    vector<string> XXX(int n) {
        vector<string> res;
        int l=0, r = 0;
        string s;
        trace_back(l, r, n, s, res);
        return res;
    }
};```

