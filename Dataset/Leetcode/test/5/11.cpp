 string XXX(string s) {
    int n = s.size();
    string ans;
    if (s.empty())
        return 0;
    int len = 1;
    vector<vector<bool>> dp(n, vector<bool>(n, false)); //dp[i][j]代表下标从i到j的子串是否回文
    for (int i = n - 1; i >= 0; i--){  //注意：i要反向遍历,因为下面会出现dp[i+1][j-1]
        for (int j = i; j < n; j++){
            if (i == j)             //一个字符必定回文
                dp[i][j] = true;
            else if (j == i + 1)    //两个字符只要判断它们是否相等
                dp[i][j] = s[i] == s[j];
            else                  //三个及以上看s[i]和s[j]是否相等且去掉头尾的子串是否回文
                dp[i][j] = s[i] == s[j] && dp[i + 1][j - 1];
            if(dp[i][j]){
                if(j-i+1>=len){
                    len=j-i+1;
                    ans=s.substr(i,j-i+1); //更新最长回文子串
                }
            }
        }
    }
    return ans;
    }

