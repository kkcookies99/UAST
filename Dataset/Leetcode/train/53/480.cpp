 class Solution {
public:
    int XXX(vector<int>& nums) {
        int n=nums.size();
        //dp[i]表示以下标i结尾的连续子数组的最大和
        int dp_cur=nums[0];//优化空间
        int res=nums[0];
        for(int i=1;i<n;i++){
            if(dp_cur<0)
                dp_cur=nums[i];
            else
                dp_cur+=nums[i];
            //结果就是所有dp[i]的最大值    
            res=max(res,dp_cur);
        }
        return res;
    }
};

