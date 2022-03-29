class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxidx = 0, p = 0;
        while (p <= maxidx && p < nums.size()) {
            maxidx = max(maxidx, nums[p] + p);
            p ++;
        }
        return p == nums.size();
    }

};

