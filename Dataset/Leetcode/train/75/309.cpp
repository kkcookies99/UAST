class Solution {
public:
    void XXX(vector<int>& nums) {
        int pos = solve(nums, 0, 0);
        solve(nums, 1, pos);
    }
    int solve(vector<int>& nums, int tag, int start) {
        int pos = start;
        for(int i = pos, j = pos; j < nums.size(); ++j) {
            if(nums[j] == tag) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                ++i;
                pos = i;
            }
        }
        return pos;
    }
};

