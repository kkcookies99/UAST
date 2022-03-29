 class Solution {
public:
    int XXX(vector<int>& prices) {
        vector<int>dp(1,0);
        int buy=prices[0];
        for(int i=1;i<prices.size();i++){
            if(prices[i]<buy)
                buy=prices[i];
            else
                dp[0]=max(dp[0],prices[i]-buy);      
        }
        return dp[0];
    }
};

