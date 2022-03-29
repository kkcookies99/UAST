class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size()==1) return nums[0];
        int f = nums[0],result = nums[0];
        for(int i=1;i<nums.size();i++){
            f = max(f+nums[i],nums[i]);
            result = max(result,f);
        }
        return result;
    }
};

