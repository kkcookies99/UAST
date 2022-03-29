 class Solution {
public:
    vector<vector<int>>res;
    unordered_map<int,int>vis;
    vector<int>tmp;
    vector<vector<int>> XXX(vector<int>& nums) {
        for(auto p : nums) vis[p] = 0;
        if(!nums.size()) {
            res.push_back(tmp);
            return res;
        }
        if(nums.size()==1) {
            res.push_back(nums);
            return res;
        }
        dfs(0,nums.size(),nums);
        return res;
    }
    void dfs(int u,int n,vector<int>& nums)
    {
        if(u == n) 
        {
            res.push_back(tmp);
            return;
        }
        for(int i=0;i<nums.size();i++)
        {
            if(!vis[nums[i]])
            {
                vis[nums[i]] = 1;
                tmp.push_back(nums[i]);
                dfs(u+1,n,nums);
                tmp.pop_back();
                vis[nums[i]] = 0;
            }
        }   
    }
};

