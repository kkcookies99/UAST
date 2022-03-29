 string XXX(string s) {
    int n = s.size();
    vector<vector<bool>> p(n,vector<bool>(n));//声明一个 n x n的int数组
    string ans;
    for (int k = 0; k < n; ++k)//k+1表示子串的长度
    {        
        for (int i = 0; i < n - k; ++i)//i<n-k,保证 j 下标不越界
        {
            int j = k + i;//这里说明j>i，不存在i>j这种不合法字符串
            if (k == 0)//单个字符
            {
                p[i][j] = true;
            }
            else if (k==1)//两个字符
            {
                p[i][j] = (s[i] == s[j]);
            }
            else//三个以上
            {
                p[i][j] = (p[i + 1][j - 1] && s[i] == s[j]);
            }
            if (p[i][j] && k + 1 > ans.size())
            {   
                ans = s.substr(i, k+1);
            }
        }
    }
    return ans;
}