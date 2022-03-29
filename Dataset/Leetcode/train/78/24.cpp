class Solution {
public:
    vector<vector<int>> mynums;
    vector<int> path;
    void backfind(vector<int>& nums,int x)
    {
        path.push_back(nums[x]);
        mynums.push_back(path);
        for(int i = x+1;i<nums.size();i++)
        {
            backfind(nums,i);
            path.pop_back();
        }
        return;
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        mynums.push_back(path);
        for(int i = 0;i<nums.size();i++)
        {
            backfind(nums,i);
            path.pop_back();
        }
        return mynums;
    }
};

