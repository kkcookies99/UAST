class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxRange = 0; 
        int i = 0; 
        while (i <= maxRange && i < nums.size()) {
            maxRange = max(maxRange, i+nums[i]);
            i++; 
        }
        return maxRange >= nums.size()-1; 
    }
};

