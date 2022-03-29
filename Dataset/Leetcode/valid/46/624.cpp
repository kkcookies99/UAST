 class Solution {
public:
    vector<int> path;
    vector<vector<int>> ans;
    vector<bool> st;

    vector<vector<int>> XXX(vector<int>& nums) {
       int n = nums.size();
       st = vector<bool>(n);
       dfs(nums, 0);
       return ans; 
    }

    void dfs(vector<int>& nums, int k)
    {
        if(k == nums.size())
        {
            ans.push_back(path);
            return;
        }
        for(int i = 0; i < nums.size(); i++)
        {
            if(!st[i])
            {
                st[i] = true;
                path.push_back(nums[i]);
                dfs(nums, k+1);
                st[i] = false;
                path.pop_back();
            }
        }
    }
};

