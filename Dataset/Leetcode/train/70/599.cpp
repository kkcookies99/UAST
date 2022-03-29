class Solution {
public:
    // int XXX(int n, int index) {
    //     if(n == index){
    //         return 1;
    //     }
    //     if(index>n){
    //         return 0;
    //     }
    //     int res = 0;
    //     res += XXX(n, index+1);
    //     res += XXX(n, index+2);
    //     return res;
    // }

    int XXX(int n) {
        int *dp = new int[n+1];
        dp[n] = 1;
        dp[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            dp[i] = dp[i+2]+dp[i+1];
        }
        return dp[0];
    }
};

