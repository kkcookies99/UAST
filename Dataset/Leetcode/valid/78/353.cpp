class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        for (int i = 0; i < pow(2, nums.size()); i++) {
            vector<int> temp;
            for (int j = 0; j < nums.size(); j++) {
                if ((i>>j)&1) temp.emplace_back(nums[j]);
            }
            ret.emplace_back(temp);
        }
        return ret;
    }
};

