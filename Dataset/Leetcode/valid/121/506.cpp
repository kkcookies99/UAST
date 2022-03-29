 class Solution {
public:
    int XXX(vector<int>& prices) {
        int profit=0,dp=0;
        for(int i = 1 ; i < prices.size() ; ++i){
            dp = max(dp + prices[i]-prices[i-1],prices[i]-prices[i-1]);
            profit = max(dp,profit);
        }
        return profit;
    }
};

