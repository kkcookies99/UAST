 class Solution {
public:
    int XXX(vector<int>& prices) {
        int ans = 0;
        int premin = prices[0];
        for(int i = 1; i<prices.size(); ++i){
            if(prices[i]<premin) premin = prices[i];
            else ans = max(ans,prices[i]-premin);
        }
        return ans;
    }
};

