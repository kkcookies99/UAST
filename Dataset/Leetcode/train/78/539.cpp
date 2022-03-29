 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> tmp;
        fun(nums, res, tmp, 0, nums.size());
        return res;
    }
    void fun(vector<int>& nums, vector<vector<int>> &res, vector<int> &tmp, int begin, int n){
        if(begin > n)return;
        res.push_back(tmp);
        for(int i=begin; i<n; ++i){
            tmp.push_back(nums[i]);
            fun(nums, res, tmp, i+1, n);
            tmp.pop_back();
        }
    }
};

