 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> res;
        string tmp="";
        helper(res,tmp,n,n);
        return res;
    }
    void helper(vector<string>& res,string tmp,int left,int right){
        if(left==0 && right==0){
            res.push_back(tmp);
            return;
        }
        if(left>0) helper(res,tmp+"(",left-1,right);
        if(right>left) helper(res,tmp+")",left,right-1);
    }
};

