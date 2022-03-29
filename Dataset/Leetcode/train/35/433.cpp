 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int i = 0;
        for(; i<nums.size(); i++){
            if(nums[i] == target)
                return i;
            if(target < nums[i])
                return i;
        }

        if(i == nums.size())
            return nums.size();
        return {};
    }
};

