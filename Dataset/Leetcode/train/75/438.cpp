 class Solution {
public:
    void XXX(vector<int>& nums) {
        int s = int(nums.size());
        int lft = 0, rgt = s - 1, cur = 0;
        while (cur <= rgt) {
            if (nums[cur] == 0)
                swap(nums[cur++], nums[lft++]);
            else if (nums[cur] == 2)
                swap(nums[cur], nums[rgt--]);
            else
                cur++;
        }
    }
};

