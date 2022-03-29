 class Solution {
public:
    int XXX(vector<int>& prices) {
        int dp[prices.size()];//以结点i为结尾的最大值
        dp[0]=0;
        int min=prices[0],mini=0;
        for(int i=1;i<prices.size();++i){
            dp[i]=max(prices[i]-prices[mini],dp[i-1]);
            if(min>prices[i]){
                min=prices[i];
                mini=i;
            }
        }
        return dp[prices.size()-1];

    }
};

