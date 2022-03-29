 class Solution {
public:
    int XXX(vector<int>& nums) 
    {
        int ans=nums[0];
        int MaxSum=nums[0];
        for(int i=1;i<nums.size();i++)
        {
            MaxSum=max(MaxSum+nums[i],nums[i]);
            if(MaxSum>ans)
            {
                ans=MaxSum;
            }
        }
        return ans;
    }
};

