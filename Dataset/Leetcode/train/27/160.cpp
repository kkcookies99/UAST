 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.size(); j++) {
            if (nums[j] == val) continue;
            swap(nums[i++], nums[j]);
        }
        return i;
    }
};

