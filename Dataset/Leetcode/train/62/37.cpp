 class Solution {
public:
    int XXX(int m, int n) {
        vector<int> dp(m,0);
        dp[0]=1;
        for(int i=0;i<n;i++)
            for(int j=1;j<m;j++)
                dp[j]+=dp[j-1];
        return dp[m-1];
    }
};

