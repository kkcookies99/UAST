 class Solution {
public:
    void XXX(vector<int>& nums) {
        int i = 0, j = nums.size()-1, cur = 0;
        while (cur <= j) {
            if (nums[cur] > 1) {
                swap(nums[cur], nums[j]);
                j--;
            } else if (nums[cur] < 1 && i < cur) {
                swap(nums[cur], nums[i]);
                i++;
            } else {
                cur++;
            }
        }
    }
};

