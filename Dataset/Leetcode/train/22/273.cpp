 class Solution {
public:
    vector<string> XXX(int n) {
        vector<vector<string>> dp;
        vector<string> dp0;
        dp0.push_back("");
        if(n==0) {
            //vector<string> dp0;
           // dp0.push_back("");
            return dp0;
        }

        
        dp.push_back(dp0);
        int i,j;
        for(i=1;i<=n;i++){
           // printf("i=%d\n",i);
            vector<string> dpn;
            for(j=0;j<i;j++){
                // printf("j=%d\n",j);
                vector<string> str1 = dp[j];
                vector<string> str2 = dp[i-1-j];
                for (string s1 : str2) {
                    //printf("a\n");
                    for (string s2 : str1) {
                       // printf("b\n");
                        dpn.push_back("("+s1+")"+s2);
                    }
                }
            }
            dp.push_back(dpn);
        }

        return dp[n];
    }
};


