class Solution {
public:
    void XXX(vector<int>& nums) {
        int n = nums.size();
        int p = 0, q = 0;

        for (int i = 0; i < n; i ++) {
            if (nums[i] == 0) {
                swap(nums[p], nums[i]);
                if (q > p) {
                    swap(nums[i], nums[q]);
                }
                p ++;
                q ++;
            } else if (nums[i] == 1) {
                swap(nums[q], nums[i]);
                q ++;
            }
        }
    }
};

