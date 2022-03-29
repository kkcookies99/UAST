 class Solution {
public:
    void XXX(vector<int>& nums) {
        for(int zero=-1, i=0, two=nums.size(); i<two; ++i)
            if(nums[i]==0) swap(nums[++zero],nums[i]);
            else if(nums[i]==2) swap(nums[--two],nums[i--]);
    }
};

