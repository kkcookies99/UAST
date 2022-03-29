 class Solution {
public:
    vector<vector<int>>res;
    void fun(vector<int>& nums, vector<int>& tmp, int index, vector<int>re) {
        if (index == nums.size()) {
            res.push_back(re);
            return ;
        }
        for (int i = 0; i < nums.size(); i++) {
            if (tmp[i] == 1) {
                re[index]=nums[i];
                tmp[i] = 0;
                fun(nums, tmp, index + 1, re);
                tmp[i] = 1;
            }
        }
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<int>tmp(nums.size(), 1), re(nums.size(),0);
        fun(nums, tmp, 0, re);
        return res;
    }
};

