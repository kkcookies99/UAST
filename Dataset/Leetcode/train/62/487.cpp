class Solution {
public:
    int XXX(int m, int n) {
        if(m == 1 && n ==1) return 1;
        int ans = 0;
        double **dp;
        dp = new double *[m];
        for(int i = 0; i < m; i++){
            dp[i] = new double [n];
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i ==0 || j == 0){
                    dp[i][j] = 1;
                }else{
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        ans = dp[m-1][n-1];
        for(int i = 0; i < m; i++){
            delete []dp[i];
        }
        delete[]dp;
        return ans;
    }
};

