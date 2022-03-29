 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.size() == 0) return 0;
        vector<int> dp(prices.size(),0);
        
        for(int i=1;i<prices.size();i++){
            for(int j=0; j<i; j++){
                if(prices[i] > prices[j]){
                    dp[i] = max(dp[i], prices[i]-prices[j]);
                }
            }
        }

        return *max_element(dp.begin(), dp.end());


    }
};

