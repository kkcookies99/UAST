class Solution {
public:
    bool XXX(vector<int>& nums) {
        if(nums.size()==1){
            return true;
        }

        int target = nums.size()-1;
        int rightMost = nums[0];
        for(int i=1;i<=rightMost;i++){
            rightMost = max(rightMost, nums[i]+i);
            if(rightMost>=target){
                return true;
            }
        }

        return rightMost>=target;
    }
};

