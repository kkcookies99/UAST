 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int x = 0, i = 0, len = nums.size();
        while (i + x < len)
        {
            if (nums[i + x] == val)
                while (i + x < len && nums[i + x] == val) x++;
            if (i + x < len)
            {
                nums[i] = nums[i + x];
                i++;
            }
        }
        return i;
    }
};

