 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n = prices.size();
    vector<int> dp(n+1);
    dp[0] = 0;
    int max_num = 0;
    for(int i=1; i<n; ++i){
        if(prices[i] - prices[i-1] <= 0)
            dp[i] = dp[i-1];
        else{
            int temp = max(prices[i] - prices[i-1], prices[i] - prices[dp[i-1]]);
            dp[i] = (prices[i] - prices[dp[i-1]]) == temp ? dp[i-1] : i-1;
            max_num = max(max_num, temp);
        }
    }
    
    return max_num;
    }
};

