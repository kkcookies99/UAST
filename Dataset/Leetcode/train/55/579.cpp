 class Solution {
public:

    bool XXX(vector<int>& nums) {
        int maxVal = nums[0];
        for(int i=1; i<nums.size(); i++){
            if(maxVal<i){
                return false;
            }
            maxVal = max(maxVal,nums[i]+i);
        }
        return true;
    }
};

