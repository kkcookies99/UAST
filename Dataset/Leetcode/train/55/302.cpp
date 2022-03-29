class Solution {
public:
    bool XXX(vector<int>& nums) {
        int size = nums.size();
        int end = size - 1;
        for(int i = size - 2; i >= 0; --i){
            if(nums[i] + i >= end)  end = i;
        }
        return end == 0;
    }
};

