 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int maxJump=nums[0];
        for(int i=1;i<nums.size();i++)
            if(i<=maxJump) maxJump=max(maxJump,nums[i]+i);  
        if(maxJump>=nums.size()-1) return true;
        return false;
    }
};

