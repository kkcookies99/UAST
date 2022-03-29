 class Solution {
public:
    int XXX(vector<int>& prices) {
        int res=0;
        for(int i=0,minp=INT_MAX;i<prices.size();i++){
            res=max(res,prices[i]-minp);
            minp=min(minp,prices[i]);
        }
        return res;
    }
};

