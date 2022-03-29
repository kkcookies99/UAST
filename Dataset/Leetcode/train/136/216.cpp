 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        if (nums.size() == 1)
            return nums[0];
        sort(nums.begin(), nums.end());
        if (nums[0] != nums[1])
            return nums[0];
        int slowPointer, fastPointer;
        for (slowPointer = 0, fastPointer = 1; fastPointer < nums.size(); ) {
            if (nums[slowPointer] == nums[fastPointer])
                ++fastPointer;
            else {
                slowPointer = fastPointer;
                ++fastPointer;
                if (nums[slowPointer] != nums[fastPointer])
                    return nums[slowPointer];
            }
        }
        return 0;
    }
};

