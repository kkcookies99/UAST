 class Solution {
public:
    int XXX(vector<int>& nums) {
        if(nums.size() == 0)
            return 0;
        int i = 0;
        for(int j = 1; j < nums.size(); j++){
            if(nums[j] != nums[i]){
                nums[++i] = nums[j];
            }
        }
        return i + 1;
        
    }
};

