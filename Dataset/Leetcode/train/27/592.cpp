 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i = -1;
        for (const auto& n: nums)
            if (n != val)
                nums[++i] = n;
        return (i+1);
    }
};

