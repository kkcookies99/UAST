 class Solution {
public:
    int XXX(vector<int>& prices) {
        int res=0,minp=INT_MAX;
        for(int i=0;i<prices.size();i++){
            minp=min(minp,prices[i]);
            res=max(res,prices[i]-minp);
        }
        return res;
    }
};

