 class Solution {
public:  
    vector<vector<int>> XXX(vector<int>& nums) 
    {
        vector<vector<int>> res(1);
        int all = 1<<nums.size();
        for(int i = 1; i<all;i++)
        {
            vector<int> tem;
            for(int j = 0;j<nums.size();j++)
            {
                if(i&(1<<j))
                {
                    tem.push_back(nums[j]);
                }
            }
            res.push_back(tem);
        }
        return res;
    }
};

