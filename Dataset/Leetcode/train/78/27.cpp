class Solution {
public:
    //可以直接遍历，遇到一个数就把所有子集加上该数组成新的子集，遍历完毕即是所有子集
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.empty()) return vector<vector<int>>();
        vector<vector<int>> res;
        res.push_back({});
        for(auto num : nums)
        {
            vector<vector<int>> state = res;
            for(auto r : res)
            {
                r.push_back(num);
                state.push_back(r);
            }
            res = state;
        }
        return res;
    }
};

