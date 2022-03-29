 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        reCall(vector<int>(), 0, nums, res);
        return res;
    }
    void reCall(vector<int> tmp, int deep, vector<int> nums, vector<vector<int>>& res) {
        // 如果深度等于原数组长度，则为一个答案
        if(deep == nums.size()) {
            res.push_back(tmp);
            return ;
        }
        deep++;
        // 遍历数组的数字
        for(int x : nums) {
            if(is(tmp, x)) {
                // 如果这个数没添加过，则添加后进入下一个深度
                tmp.push_back(x);
                reCall(tmp, deep, nums, res);
                // 回溯
                tmp.pop_back();
            }
        }
    }
    // 判断一维数组是否已经存在这个数字
    bool is(vector<int> v, int num) {
        for(int x : v) 
            if(num == x)
                return false;
        return true;
    }
};

