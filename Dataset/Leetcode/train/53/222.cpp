class Solution {
public:
    int XXX(vector<int>& nums) {
        int max=nums[0];
        for (int i=1;i<nums.size();i++)
        {
            if (nums[i-1]>0) nums[i]+=nums[i-1];
            max=(max>=nums[i])? max:nums[i];
        }
        return max;
    }
};

