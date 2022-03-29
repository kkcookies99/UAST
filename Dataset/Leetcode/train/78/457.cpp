 class Solution {
public:
    void get_ans(vector<vector<int>> &ret, vector<int> &nums, int l, vector<int> &tmp) {
        if (l == nums.size()) {
            if (tmp.size() != 0) ret.push_back(tmp);
            return ;
        }
        get_ans(ret, nums, l + 1, tmp);
        tmp.push_back(nums[l]);
        get_ans(ret, nums, l + 1, tmp);
        tmp.pop_back();
        return ;
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> ret;
        vector<int> tmp;
        ret.push_back(tmp);
        get_ans(ret, nums, 0, tmp);
        return ret;
    }
};

