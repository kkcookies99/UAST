 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        func(res, "", 0, 0, n);
        return res;
    }
    
    void func(vector<string> &res, string str, int l, int r, int n){
        if(l > n || r > n || r > l) return ;
        if(l == n && r == n) {res.push_back(str); return;}
        func(res, str + '(', l+1, r, n);
        func(res, str + ')', l, r+1, n);
        return;
    }
};

