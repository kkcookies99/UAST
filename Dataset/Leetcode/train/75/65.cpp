class Solution {
public:
    void XXX(vector<int>& nums) {
        int lo = 0, hi = nums.size()-1, mi = 0;
        while (mi <= hi) {
            switch (nums[mi]) {
                case 0: swap(nums[lo], nums[mi]);
                        ++mi;
                        ++lo;
                        break;

                case 1: ++mi;
                        break;
                
                case 2: swap(nums[mi], nums[hi]);
                        --hi;
                        break;
            }
        }
    }
};

