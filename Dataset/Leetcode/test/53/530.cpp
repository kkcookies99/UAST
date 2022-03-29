 class Solution {
public:
    int XXX(vector<int>& nums) {
        int preSum = 0;
        int minPreSum = 0;
        int maxSum = INT_MIN;
        for (int num: nums) {
            preSum += num;
            maxSum = max(maxSum, preSum - minPreSum);
            minPreSum = min(minPreSum, preSum);
        }
        return maxSum;
    }
};

