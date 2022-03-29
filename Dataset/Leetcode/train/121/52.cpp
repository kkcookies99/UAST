 class Solution {
public:
    int XXX(vector<int>& prices) {
        int n=prices.size(),dp[n],ans=0; //dp[i]表示第i+1天卖出时的最大利润
        dp[0]=0;
        for(int i=1;i<n;i++) {
            dp[i]=max(dp[i-1]+prices[i]-prices[i-1],prices[i]-prices[i-1]); //状态转移方程
            ans=max(ans,dp[i]);
        }
        return ans;
    }
};

