 class Solution {
public:
    vector<int> temp;
    vector<vector<int>> ans;
    void dfs(vector<int>& nums,vector<bool>& f,int cur)
    {
        if (cur==nums.size()) 
        {
            ans.push_back(temp);
            return;
        }
        for (int i=0;i<nums.size();i++)
        {
            if (f[i]) continue;
            f[i]=true;
            temp.push_back(nums[i]);
            dfs(nums,f,cur+1);
            f[i]=false;
            temp.pop_back();
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<bool> f(nums.size(),false);
        dfs(nums,f,0);
        return ans;
    }
};

