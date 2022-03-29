 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int s=nums.size();
        vector<bool> dp(s);
        dp[0]=true;
        for(int i=1;i<s;++i)
        {
            for(int j=0;j<i;++j)
                if(dp[j]==true&&nums[j]+j>=i)
                {
                    dp[i]=true;
                    break;
                }
        }
        return dp[s-1];
    }
};
```’

```cpp
class Solution {
public:
    bool XXX(vector<int>& nums) {
        int s=nums.size();
        vector<int> dp(nums);
        for(int i=s-2;i>=0;--i)
        {
            for(int j=1;j<=dp[i]&&i+j<s;++j)
            {
                if(dp[i]>=s-1-i)break;
                dp[i]=max(dp[i],dp[i+j]+j);  
            }
        }
        return dp[0]>=s-1?true:false;
    }
};

