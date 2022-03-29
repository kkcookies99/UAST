 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        _result.clear();
        _subSet.clear();
        generateResult(nums, 0);
        return _result;
    }

    void generateResult(vector<int>& nums, size_t start) {
        _result.push_back(_subSet);
        for (size_t loop = start; loop < nums.size(); ++loop) {
            _subSet.push_back(nums[loop]);
            generateResult(nums, loop + 1);
            _subSet.pop_back();
        }
    }
private:
    vector<vector<int>> _result;
    vector<int> _subSet;
};

