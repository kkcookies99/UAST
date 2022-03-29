class Solution {
public:

    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> v;
        vector<bool> isuse(nums.size(),false);
        dfs(ans,nums,v,isuse);
        return ans;
    }
    void dfs(vector<vector<int>>& ans,vector<int>& nums,vector<int>& v,vector<bool>& isuse)
    {
        if(v.size() == nums.size())
        {
            ans.push_back(v);
        }
        else
        {
            for(int i = 0; i < nums.size(); i++)
            {
                if(!isuse[i])
                {
                    v.push_back(nums[i]);
                    isuse[i] = true;
                    dfs(ans,nums,v,isuse);
                    v.pop_back();
                    isuse[i] = false;
                }
            }
        }
    }
};

