class Solution {
public:
    void XXX(vector<int>& nums) {
        // [0, i),   [i, j),  [unprocess), [k, nums.size())
        // [<pivot], [=pivot],             [>pivot]
        // partion 3-ways
        int i = 0, j = 0, k = nums.size();
        int pivot = 1;
        while (j != k) {
            if (nums[j] < pivot) {
                swap(nums[i], nums[j]);
                ++j;
                ++i;
            } else if (nums[j] > pivot) {
                swap(nums[j], nums[k-1]);
                --k;
            } else {
                ++j;
            }
        }
    }
};

