 class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size()<2) return nums.size();
        int l=0,r=1;
        while(r<nums.size()){
            if(nums[r]!=nums[l]) nums[++l]=nums[r];
            else ++r;
        }
        return l+1;
    }
};

