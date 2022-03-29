 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int length=nums.size(),new_length = 0;
        for(int i=0;i<length;i++) if(nums[i]!=val) nums[new_length++]=nums[i];
        return new_length;
    }
};

