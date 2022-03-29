 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int far=0;
        int n = nums.size();
        for(int i=0;i<n;i++){
            if(i>far)
                return false;
            if(nums[i]+i>=n-1)
                return true;
            if(nums[i]+i>far){
                far=nums[i]+i;
            }
        }
        return false;
    }
};

