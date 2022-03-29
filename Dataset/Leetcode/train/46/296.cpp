class Solution {
public:
    void dfs(vector<vector<int>> &res,vector<int> &nums,int first,int len)
    {
        if(first==len)
        {
            res.push_back(nums);
            return;
        }
        for(int i=first;i<len;i++)
        {
            swap(nums[i],nums[first]);
            find(res,nums,first+1,len);
            swap(nums [i],nums[first]);
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        dfs(res,nums,0,nums.size());
        return res;
    }
};

