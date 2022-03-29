class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> a;
        vector<int> r{};
        for(int k=0;k<=nums.size();k++)
        {
            backtrack(nums,r,a,0,k);
        }
        return a;
    }

    void backtrack(vector<int>&nums, vector<int>& r, vector<vector<int>>& a, int index, int k)
    {
        if(r.size()==k)
        {
            a.push_back(r);
            return;
        }
        for(int i=index;i<nums.size()-(k-r.size())+1;i++)//这部分优化是在上一题77.组合里面学到的
        {
            r.push_back(nums[i]);
            backtrack(nums,r,a,i+1,k);
            r.pop_back();
        }
    }
};

