 class Solution {
public:
    int XXX(vector<int>& nums) {
        vector<int> dp(nums.size());
        int ans=-100000;
        if(nums.size()==1) return nums[0];
        dp[0] = nums[0];
        for(int i=1;i<nums.size();i++)
        {
            dp[i] =max(dp[i-1]+nums[i],nums[i]);
            ans = max(ans,dp[i-1]);
        }
        ans = max(ans,dp[nums.size()-1]);
        return ans;

        /*
        vector<int> dp(nums.size());
        if(nums.size()==1) return nums[0];
        dp[0] = nums[0];
        int ans=-100000;
        for(int i=1;i<nums.size();i++)
        {
            dp[i] = dp[i-1]+nums[i];
        }
        for(int i=0;i<nums.size();i++)
        {
            ans = max(ans,dp[i]);
            for(int j=i+1;j<nums.size();j++)
            {
                ans = max(ans,dp[j]-dp[i]);
            }
        }
        return ans;*/
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


