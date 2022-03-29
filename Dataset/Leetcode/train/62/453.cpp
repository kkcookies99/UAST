class Solution {
public:
    int XXX(int m, int n) {
        //定义dp[j]为到达 【i,j】这个点的方法
        vector<int> dp(n);
        dp[0] = 1;
        for(int i = 0;i<m;++i ){
            for(int j = 0;j<n;++j){
                if(j == 0){
                    dp[j] = dp[j];
                }else if( i == 0 ){
                    dp[j] = dp[j-1];
                }else{
                    dp[j] += dp[j-1];
                }
            }
        }
        return dp[n-1];
    }
};

