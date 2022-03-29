 class Solution {
public:
    int XXX(vector<int>& prices) {
        int right=prices.back();
        int res=0;
        for(int i=prices.size()-2;i>=0;i--){
            if(right-prices[i]>res)res=right-prices[i];
            right=max(right,prices[i]);
        }
        return res;
    }
};

