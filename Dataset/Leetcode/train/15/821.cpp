 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int len=nums.size();
        vector<vector<int>> res;
        sort(nums.begin(),nums.end());
        for(int i=len-1;i>=2;--i)
        {
            int left=0,right=i-1;
            while(right>left)
            {
                if(nums[left]+nums[right]==-nums[i])
                {
                    res.push_back({nums[left],nums[right],nums[i]});
                    while(left<right&&nums[left]==nums[left+1])++left;//如果找到了一定需要去重,不再要重复的
                    while(right>left&&nums[right]==nums[right-1])--right;//同上
                    ++left,--right;
                }
                else if(nums[left]+nums[right]>-nums[i])
                    --right;
                else
                    ++left;
            }
            while(i>=2&&nums[i]==nums[i-1])--i;//对于第三个数也需要去重
        }
        return res;
    }
};

