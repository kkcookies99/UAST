 class Solution {
public:
    int XXX(vector<int>& nums) {
        int max = nums[0];
        for(int i = 1; i < nums.size();i++){
            if(nums[i] + nums[i-1] > nums[i]){
                nums[i] = nums[i] + nums[i-1];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
};

