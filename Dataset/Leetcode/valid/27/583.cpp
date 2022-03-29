 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int count = 0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=val)
                nums[count++] = nums[i];
        }
        return count;
    }
};

