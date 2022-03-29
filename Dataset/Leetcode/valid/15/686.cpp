 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int> > ans;
        if(nums.size()<3) return ans;
        sort(nums.begin(), nums.end());
        for(int i=0;i<nums.size()-2;i++)
        {
            if(i>0&&nums[i]==nums[i-1]) continue;
            int l=i+1,r=nums.size()-1;
            while(l<r)
            {
                if(nums[i]+nums[l]+nums[r]<0) l++;
                else if(nums[i]+nums[l]+nums[r]>0) r--;
                else
                {
                    ans.push_back({nums[i], nums[l], nums[r]});
                    l++;
                    r--;
                    while(nums[l]==nums[l-1]&&l<r)l++;
                    while(nums[r]==nums[r+1]&&l<r)r--;
                }
            }
        }
        return ans;
    }
};

