 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ans;
        int first=0;
        dfs(ans,first,nums);
        return ans;
    }
    void dfs(vector<vector<int>>& ans,int first, vector<int>& nums)
    {
        if(first==nums.size()-1)
        {
            ans.push_back(nums);
            return;
        }
        else
        {
            for(int i=first; i<nums.size(); i++)
            {
                    swap(nums[first],nums[i]);
                    dfs(ans,first+1,nums);
                    swap(nums[first],nums[i]);
            }
        }
    }

};

