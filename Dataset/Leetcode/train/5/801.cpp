 class Solution {
public:
    string XXX(string s) {
        int n = s.size();
        int length = 0;
        string str = "";
        int vec[] = {0,0};
        vector<vector<bool>> dp(n,vector<bool>(n));
        for(int i = n-1; i >= 0; i--){
            for(int j = i; j < n; j++){
                if(j-i <= 1)   dp[i][j] = (s[i]==s[j]);
                else dp[i][j] = (s[i]==s[j]) && dp[i+1][j-1];
                if(dp[i][j]){
                    if(length <= j-i){
                        vec[0] = i;
                        vec[1] = j;
                        length = j-i;
                    }
                }
            }
        }
        int i = vec[0];
        int j = vec[1];
        return string (s.begin()+i,s.begin()+j+1);

    }
};

