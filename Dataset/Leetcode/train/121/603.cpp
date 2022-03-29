 class Solution {
public:
    int XXX(vector<int>& prices) {
        int minv = INT_MAX;
        int res= 0;
        for(auto x : prices){
            minv = min(minv, x);
            res = max(res, x- minv);
        }
        return res;
    }
};

