 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        if(0 == nums.size())
            return 0;
        int j = 0;
        for(int i = 0 ;i<nums.size();++i){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
};

