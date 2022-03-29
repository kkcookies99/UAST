 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int i=0;
        for(i;i<nums.size();i++){
            if(nums[i]>=target){
                return i;
            }
        }    
        return i;
    }      
};

