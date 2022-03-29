 class Solution {
public:
    //如果使用char str[]则需要记录一个cur
    void print_kuohao(vector<string>&res, string str, int l, int r, int n){
        if(l == n && r == n){res.push_back(str); return;}
        if(l < n)print_kuohao(res, str + '(', l + 1, r, n);
        if(r < l)print_kuohao(res, str + ')', l, r + 1, n);
    }
    vector<string> XXX(int n) {
        vector<string> res;
        print_kuohao(res, "", 0, 0, n);
        return res;
    }
};

