 class Solution {
public:
    int XXX(vector<int>& nums) {
        int length = nums.size();
        if(length == 1) return nums[0];
        int max = nums[0];
        for(int i=1; i!=length; ++i){
            if(nums[i-1] + nums[i] > nums[i]) nums[i] = nums[i-1] + nums[i];
            if(nums[i] > max) max = nums[i];
        }
        return max;
         
    }
};

