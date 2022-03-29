 class Solution {
public:
    vector<string> ans;
    vector<string> XXX(int n) {
        get_ans("",n,n);
        return ans;
    }
    void get_ans(string tmp, int l, int r) {
        if(l > r  ) return ;
        if(l == 0  ){
            for(int i=0;i<r;i++){
                tmp.push_back(')');
            }
            ans.push_back(tmp);
            return;
        }

        tmp.push_back('(');
        get_ans(tmp,l-1,r);
        tmp.pop_back();

        tmp.push_back(')');
        get_ans(tmp, l ,r-1);
        tmp.pop_back();
    }
};

