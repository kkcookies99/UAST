class Solution {
public:
    int XXX(int n) {
        
        //dp[n]表示n道楼梯有几种爬的方法
        if(n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else{
            int dp[n+1];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 2;
            for(int i = 3;i <= n;++i){
                dp[i] = dp[i-1]+dp[i-2];//经过一步到第i道楼梯与经过两步到i道楼梯的方法数之和
            }
            return dp[n];
        }
    }
};

