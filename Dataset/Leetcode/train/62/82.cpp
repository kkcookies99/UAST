 class Solution {
public:
    int XXX(int m, int n) {
        vector<int> dp = vector<int> (n, 1);
        for (int i=1;i<m;i++)
            for(int j=0;j<n;j++)
                if (j>0) dp[j] += dp[j-1];
        return dp[n-1];
    }
};

