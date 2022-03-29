class Solution {
public:
    int XXX(int n) {
        vector<int> dp(n+1);
        dp[0] = 1;
        dp[1] = 1;
        if(n >= 2){
            for(int i = 2; i <= n; i++){
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }
};

