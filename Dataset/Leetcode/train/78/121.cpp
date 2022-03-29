class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
    vector<vector<int>> res;
    res.push_back({});
    if(nums.size()==0) return res;
    for(auto i:nums)
    {
        int k=res.size();
        vector<vector<int>> tmp(res);
        for(int j=0;j<k;j++)
        {
            tmp[j].push_back(i);
            res.push_back(tmp[j]);
        }
        
    }
    return res;
    }
};

