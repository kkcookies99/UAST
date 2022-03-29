 class Solution {
public:
    int XXX(vector<int>& nums) {
        int maxValue = INT_MIN,preValue = 0;
        for(int& num : nums)
        {
            preValue = preValue < 0 ? num : (num + preValue);
            maxValue = max(maxValue,preValue);
        }
        return maxValue;
    }
};

