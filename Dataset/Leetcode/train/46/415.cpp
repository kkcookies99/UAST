 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> an;
        vector<int> used(nums.size(),0);
        dfs(ans,an,used,nums);
        return ans;
    }
    void dfs(vector<vector<int>>& ans, vector<int>& an, vector<int>& used, vector<int>& nums)
    {
        if(an.size()==nums.size())
        {
            ans.push_back(an);
        }
        else
        {
            for(int i=0; i<nums.size(); i++)
            {
                if(used[i]==0)
                {
                    used[i]=1;
                    an.push_back(nums[i]);
                    dfs(ans,an,used,nums);
                    an.pop_back();
                    used[i]=0;
                }
            }
        }
    }

};

