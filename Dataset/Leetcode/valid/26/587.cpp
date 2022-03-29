 class Solution {
   public:
    int XXX(vector<int>& nums) {
        if (nums.empty() || nums.size() == 1)
            return nums.size();
        int slowIndex = 0, fastIndex = 1;
        while (fastIndex < nums.size()) {
            if (nums[fastIndex] != nums[slowIndex])
                nums[++slowIndex] = nums[fastIndex];
            fastIndex++;
        }
        return slowIndex + 1;
    }
};

