class Solution {
public:
    int XXX(vector<int>& nums) {
        int sum = 0, max = INT_MIN;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums[i];
            max = sum > max ? sum : max;
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
};

