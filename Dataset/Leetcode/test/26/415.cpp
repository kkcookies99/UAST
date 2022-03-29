 class Solution {
public:
    int XXX(vector<int>& nums) {
        int k = 0;
        for(int i = 0; i < nums.size(); i++){
            if(!i || nums[i] != nums[i - 1])
                nums[k++] = nums[i];
        }
        return k;
    }
};

