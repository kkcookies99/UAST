class Solution {
public:
    bool XXX(vector<int>& nums) {
        int n = nums.size();
        if(n > 1 && !nums[0]) return false;
        int end = nums[0];
        for(int i = 1; i < n - 1; i++) {
            end = max(end, i + nums[i]);
            if(end <= i) return false;
        }

        return true;
    }
};

