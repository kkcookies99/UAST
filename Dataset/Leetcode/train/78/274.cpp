class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> result;
        vector<int> res;
        int si=nums.size();

        for(int i=0;i<(1<<si);i++)
        {
            for(int j=0;j<si;j++)
            {
                if((1<<j)&i)
                   res.push_back(nums[j]);        
            }
            result.push_back(res);
            res.clear();
        }
        return result;
    }
};

