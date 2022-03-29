class Solution {
public:
    int XXX(int n) {
        vector<int> nums;
        nums.resize(n+1);
        nums[0] = 1;
        nums[1] = 2;
        for(int i = 2; i < n; i++) {
            nums[i] = nums[i-2] + nums[i-1];
        }
        return nums[n-1];
    }
};

