 class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size() == 1) return true;
        int max_i = nums[0];//可以到达的最大下标
        for(int i = 1;i <= max_i;i++){
            max_i = max(max_i,nums[i] + i);
            if(max_i >= nums.size() - 1)
                return true;
        }
        return false;
    }
};

