class Solution {
public:
    bool XXX(vector<int>& nums) {
        if (nums.size() < 2) return true;
        int maxDis = nums[0];
        for (int i=1; i<nums.size() && i<=maxDis; i++) {
            maxDis = max(maxDis, i+nums[i]);
            if (maxDis >= nums.size()-1) return true;
        }
        return false;
    }
};

