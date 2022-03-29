 class Solution {
public:
    int XXX(vector<int>& nums) {
        int idx = -1;
        for (int i = 0; i < nums.size(); ) {
            int num = nums[i];
            idx++;
            swap(nums[i], nums[idx]);
            
            i++;
            while (i < nums.size() && nums[i] == num) i++;
        }

        return idx + 1;
    }
};

