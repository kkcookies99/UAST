 class Solution {
public:
    int XXX(vector<int>& nums) {
        int maxSum = INT_MIN;
        int sum = 0;

        for (int i = nums.size() - 1; i >= 0; --i) {
            sum += nums[i];
            if (maxSum < sum) maxSum = sum;
            if (sum < 0) sum = 0;
        }

        return maxSum;
    }
};

