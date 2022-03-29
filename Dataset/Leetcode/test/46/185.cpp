class Solution {
public:
    void dfs(const vector<int>& nums, vector<int>& tmp, vector<int>& flag, vector<vector<int>>& ans)
    {
        if(tmp.size() == nums.size())
        {
            ans.push_back(tmp);
            return;
        }
        for(int i = 0; i < nums.size(); i++)
        {
            if(flag[i] == 0)
            {
                tmp.push_back(nums[i]);
                flag[i] = 1;
                dfs(nums, tmp, flag, ans);
                flag[i] = 0;
                tmp.pop_back();
            }
        }
        return;
    }

    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.empty())
            return vector<vector<int>>();
        vector<vector<int>> ans;
        vector<int> flag(nums.size(), 0);
        vector<int> tmp;
        for(int i = 0; i < nums.size(); i++)
        {
            if(flag[i] == 0)
            {
                tmp.push_back(nums[i]);
                flag[i] = 1;
                dfs(nums, tmp, flag, ans);
                tmp.pop_back();
                flag[i] = 0;
            }
        }
        return ans;
    }
};

