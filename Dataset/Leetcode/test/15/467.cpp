 class Solution {
public:
    unordered_map<int,int> cnt;
    vector<vector<int>> XXX(vector<int>& nums) {
        //只能找比它大的
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        const int n = nums.size();
        for(auto & u : nums) cnt[u] ++;
        for(int i = 0;i < n;i ++)
        {
            for(int j = i + 1;j < n;j ++)
            {
                int k = -nums[i]-nums[j];
                if(!cnt[k] || nums[j] > k) continue;
                if(nums[j] == k)
                {
                    if(j + 1 < n && nums[j + 1] == nums[j])
                    {
                        ans.push_back({nums[i],k,k});
                    }
                }
                else
                {
                    ans.push_back({nums[i],nums[j],k});
                }
                while(j + 1 < n && nums[j+1] == nums[j]) j ++;
            }
            while(i + 1 < n && nums[i+1] == nums[i]) i ++;
        }
        return ans;
    }
};

