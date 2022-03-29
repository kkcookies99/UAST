class Solution {
public:
    int XXX(int n) {
        if(n<=2)return n;
        vector<int>dp(n+1);//dp是存放爬法的
//递推式:dp[n]中爬楼梯的爬法是1+dp[n-1]的爬法和2+dp[n-2]的爬法  
//所以dp[n]=dp[n-1]+dp[n-2]
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
       for(int i=3;i<=n;i++){
           dp[i]=dp[i-1]+dp[i-2];
       }
       return dp[n];
    }
};

