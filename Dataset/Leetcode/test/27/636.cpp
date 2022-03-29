 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        if (nums.size() == 0) { return 0; }
        int j = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != val) { 
                nums[j++] = nums[i]; 
            }
        }
        return j;
    }
};

