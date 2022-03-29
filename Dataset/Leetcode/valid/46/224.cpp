class Solution {
public:
    vector<vector<int>>res;
    vector<vector<int>> XXX(vector<int>& nums) 
    {
        int n=nums.size();
        dfs(nums,0,n);
        return res;
    }

    void dfs(vector<int>& nums,int start,int n)
    {
        if(start==n)
        {
            res.push_back(nums);
            return;
        }
        for(int i=start;i<n;i++)
        {
            swap(nums[i],nums[start]);
            dfs(nums,start+1,n);
            swap(nums[i],nums[start]);
        }
    }
};

