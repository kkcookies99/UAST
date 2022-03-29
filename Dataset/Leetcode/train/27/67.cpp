 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        vector<int> res;
        for (auto &num : nums)
            if (num != val) res.push_back(num);
        nums = res;
        return (int)res.size();
    }
};

