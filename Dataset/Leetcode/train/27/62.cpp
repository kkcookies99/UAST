 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i = 0, j = 0;
        while (true) {
            while (i < nums.size() && nums[i] != val) i++;
            if (i == nums.size()) break;

            j = i + 1;
            while (j < nums.size() && nums[j] == val) j++;
            if (j == nums.size()) break;

            swap(nums[i], nums[j]);
            i++;
            j++;
        }

        return i;
    }
};

