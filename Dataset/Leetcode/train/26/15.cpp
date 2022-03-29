 class Solution {
public:
    int XXX(vector<int>& nums) {
        if (nums.empty()) return 0;
        int slow = 0, fast = 1;
        while (fast < nums.size()) {
            if (nums[slow] != nums[fast])
                 nums[++slow] = nums[fast];
            fast++;
        }

        return slow+1;
    }
};

