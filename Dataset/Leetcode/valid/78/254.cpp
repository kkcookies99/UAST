class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        dfs(0,nums);
        return Res;
    }

    vector<int> res;
    vector<vector<int>> Res;
    void dfs(int start, vector<int>& nums)
    {
        Res.push_back(res);
        if(start==nums.size())
        return ;
        for(int i=start;i<nums.size();i++)
        {
            res.push_back(nums[i]);
            dfs(i+1,nums);
            res.pop_back();
        }
    }
};


