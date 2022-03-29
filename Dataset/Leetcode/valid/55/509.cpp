 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int size = nums.size();
        int min = size - 1;
        for(int i=size - 1;i>=0;i--){
            if(i+nums[i]>=min) min = i;
        }
        if(!min) return true;
        return false;
    }
};

