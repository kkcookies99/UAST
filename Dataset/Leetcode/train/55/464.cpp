 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxlen = 0, n = nums.size();
        for (int i = 0; i < n - 1; ++i)
        {
            maxlen = max(maxlen, nums[i]);
            if (maxlen <= 0)
                return false;
            maxlen--;
        }
        return true;
    }
};

