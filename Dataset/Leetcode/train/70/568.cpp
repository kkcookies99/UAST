class Solution {
public:
    int XXX(int n) {
        int dp[n+1];
        for(int i=1;i<n+1;i++){
            if(i==1){
                dp[i]=1;
            }else if(i==2){
                dp[i]=2;
            }else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }
        return dp[n];

    }
};

