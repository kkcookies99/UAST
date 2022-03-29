 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxTo = 0;
        for(int i=0; i<nums.size(); ++i) {
            if(i <= maxTo) {
                maxTo = max(maxTo, i+nums[i]);
            }
            if(maxTo >= nums.size()-1)
                return true;
        }
        return false;
    }
};

