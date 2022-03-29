 class Solution {
public:
    vector<string> XXX(int n) {
        vector<string> dp[n+1];
        dp[0] = vector<string>{""};
        dp[1] = vector<string>{"()"};
        if (n<=1)
            return dp[n];
        for(int k = 2; k<=n;k++){
            for (int i = 0; i < k; ++i) {
                for(auto p:dp[i]){
                    for(auto q:dp[k-1-i]){
                        string parenthesis = "("+p+")"+q;
                        dp[k].push_back(parenthesis);
                    }
                }
            }
        }
        return dp[n];
    }
};

