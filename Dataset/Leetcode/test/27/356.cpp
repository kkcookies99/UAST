 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int len = nums.size();
        for(int i = 0; i < len; i++) {
            if(nums[i] == val) {
                nums[i] = nums[--len];
                i--;
            }
        }
        return len;
    }
};

