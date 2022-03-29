 class Solution {
public:
    bool XXX(vector<int>& nums) {
        
        int target_pos = nums.size()-1;
        for(int i=nums.size()-2; i>=0; i--){
            if(nums[i] >= target_pos-i){
                target_pos = i;
            }
        }

        if(target_pos == 0)
            return true;
        else
            return false;
    }
};

