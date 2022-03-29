class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum = 0;
        int maxSum = -300000000;
        for (int i = 0; i < nums.size(); i++ ) {
            sum += nums[i];
            if ( sum > maxSum ) maxSum = sum;
            if ( maxSum < nums[i]) maxSum = nums[i];
            else if ( sum < 0) sum = 0;
        }
        return maxSum;
    }
};

