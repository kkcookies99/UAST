 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        if(target<=nums[0])
        return 0;
        if(target>nums.back())
        return nums.size();
        return (int)(lower_bound(nums.begin(),nums.end(),target)-nums.begin());
        
    }
};

