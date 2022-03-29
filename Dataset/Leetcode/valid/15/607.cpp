 class Solution {
public:
    vector<vector<int>> ans;
    vector<int> temp;
    int n;
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        n = nums.size();
        dfs(0,nums,0);
        return ans;
    }
    void dfs(int start,vector<int> nums,int target)
    {
        if (target == 0 && temp.size() == 3)
        {
            ans.push_back(temp);
        }
        for (int i = start; i<n; i++)
        {
            if(i > start && nums[i] == nums[i-1])
                continue;
            temp.push_back(nums[i]);
            // target -= nums[i];
            dfs(i + 1,nums,target - nums[i]);
            temp.pop_back();
        }
    }
};

