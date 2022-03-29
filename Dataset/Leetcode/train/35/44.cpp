 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        auto l = nums.cbegin(), r = nums.cend();
        while(l != r) {
            auto m = l + (r - l) / 2;
            if(target > *m) l = m + 1;
            else r = m;
        }
        return l - nums.cbegin();
    }
};

