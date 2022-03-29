 class Solution {
public:
    string XXX(string s) {
        int n=s.size();
        if(n==0)
            return "";
        vector<vector<int>> dp(n,vector<int>(n,0));
        int max=1;
        int max_left=0;
        int max_right=0;

        for(int right=0;right<n;right++)
        {
            for(int left=0;left<=right;left++)
            {
                if(s[left]==s[right]&&(right-left<2||dp[left+1][right-1]==1))
                {
                    dp[left][right]=1;
                    if(right-left+1>max)
                    {
                        max=right-left+1;
                        max_left=left;
                        max_right=right;
                    }
                }
                else
                    dp[left][right]=0;
            }
        }
        return s.substr(max_left,max);
    }
};

